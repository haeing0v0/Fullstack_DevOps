package org.cloud.mapper;

import java.util.List;

import org.cloud.dto.BoardDTO;
import org.cloud.dto.FileDTO;

public interface BoardMapper {

	List<BoardDTO> selectBoardList() throws Exception;
	void insertBoard(BoardDTO board) throws Exception;
	BoardDTO openBoardDetail(int boardId);
	void updateHitCount(int boardId) throws Exception;
    void updateBoard(BoardDTO board) throws Exception;
    void deleteBoard(int boardId) throws Exception;
	void insertFileList(List<FileDTO> list) throws Exception;
	List<FileDTO> selectFileList(int boardId) throws Exception;
	void deleteFile(int fileIdx) throws Exception;
}
