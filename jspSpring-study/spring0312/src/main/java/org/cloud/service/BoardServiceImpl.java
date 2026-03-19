package org.cloud.service;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.cloud.dto.BoardDTO;
import org.cloud.dto.FileDTO;
import org.cloud.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Service
public class BoardServiceImpl implements BoardService {

    private final DataSource dataSource;

	@Autowired
	private BoardMapper boardMapper;

    BoardServiceImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }
	
	@Override
	public List<BoardDTO> selectBoardList() throws Exception {
		return boardMapper.selectBoardList();
	}
	
	@Override
	public void insertBoard(BoardDTO board, MultipartHttpServletRequest request) throws Exception {
		boardMapper.insertBoard(board);
		saveFiles(board, request);
	}
	
	@Override
	public BoardDTO openBoardDetail(int boardId) throws Exception {
		boardMapper.updateHitCount(boardId);
		
		BoardDTO board = boardMapper.openBoardDetail(boardId);
		board.setFileList(boardMapper.selectFileList(boardId));
		return board;
	}
	
	@Override
    public void updateBoard(BoardDTO board, MultipartHttpServletRequest request) throws Exception {
        boardMapper.updateBoard(board);
        saveFiles(board, request);
    }

    @Override
    public void deleteBoard(int boardId) throws Exception {
        boardMapper.deleteBoard(boardId);
    }
    
    private void saveFiles(BoardDTO board, MultipartHttpServletRequest request) throws Exception {
    	if (ObjectUtils.isEmpty(request)) {
    		return;
    	}
    	
    	List<FileDTO> fileList = new ArrayList<FileDTO>();
    	String path = "C:/upload/";
    	File dir = new File(path);
    	
    	if (!dir.exists()) {
    		dir.mkdirs();
    	}
    	
    	Iterator<String> iterator = request.getFileNames();
    	while(iterator.hasNext()) {
    		List<MultipartFile> list = request.getFiles(iterator.next());
    		
    		for (MultipartFile mFile : list) {
				if (!mFile.isEmpty()) {
					String saveName = System.currentTimeMillis() + "_" + mFile.getOriginalFilename();
					mFile.transferTo(new File(path + saveName));
					
					FileDTO fileDTO = new FileDTO();
					fileDTO.setBoardId(board.getBoardId());
					fileDTO.setFileSize(mFile.getSize());
					fileDTO.setOriginalFileName(mFile.getOriginalFilename());
					fileDTO.setStoredFilePath(path + saveName);
					fileDTO.setCreatorId(board.getCreatorId());
					fileList.add(fileDTO);
				}
			}
    	}
    	
    	if (fileList.size() > 0) {
    		boardMapper.insertFileList(fileList);
    	}
    }
    
    @Override
    public void deleteFile(int fileIdx) throws Exception {
    	boardMapper.deleteFile(fileIdx);
    }
}
