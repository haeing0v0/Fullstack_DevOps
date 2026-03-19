package org.cloud.service;

import java.util.List;

import org.cloud.dto.BoardDTO;
import org.cloud.dto.FileDTO;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public interface BoardService {

	List<BoardDTO> selectBoardList() throws Exception;
	void insertBoard(BoardDTO board, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception;
	BoardDTO openBoardDetail(int boardId) throws Exception;
	void updateBoard(BoardDTO board, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception;
    void deleteBoard(int boardId) throws Exception;
    void deleteFile(int fileIdx) throws Exception;
}
