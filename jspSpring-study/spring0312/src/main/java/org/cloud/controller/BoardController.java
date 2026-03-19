package org.cloud.controller;

import java.util.List;

import org.cloud.dto.BoardDTO;
import org.cloud.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
@RequestMapping("/board")
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@GetMapping("/openBoardList.do")
	public String openBoardList(Model model) throws Exception {
		List<BoardDTO> list = boardService.selectBoardList();
		model.addAttribute("list", list);
		return "board/boardList";
	}
	
	@GetMapping("openBoardWrite.do")
	public String openBoardWrite() {
		return "board/boardWrite";
	}
	
	@PostMapping("/insertBoard.do")
	public String insertBoard(BoardDTO board, MultipartHttpServletRequest multipartHttpServletRequest) throws Exception {
		boardService.insertBoard(board, multipartHttpServletRequest);
		return "redirect:/board/openBoardList.do";
	}
	
	@GetMapping("/openBoardDetail.do")
	public String openBoardDetail(@RequestParam("boardId") int boardId, Model model) throws Exception {
	    BoardDTO board = boardService.openBoardDetail(boardId);
	    model.addAttribute("board", board);
	    return "board/boardDetail";
	}
	
	@PostMapping("/updateBoard.do")
	public String updateBoard(BoardDTO board) throws Exception {
	    boardService.updateBoard(board);
	    return "redirect:/board/openBoardDetail.do?boardId=" + board.getBoardId();
	}

	@GetMapping("/deleteBoard.do")
	public String deleteBoard(@RequestParam("boardId") int boardId) throws Exception {
	    boardService.deleteBoard(boardId);
	    return "redirect:/board/openBoardList.do";
	}
	
	@PostMapping("/deleteFile.do")
	@ResponseBody
	public String deleteFile(@RequestParam("fileIdx") int fileIdx) throws Exception {
		try {
			boardService.deleteFile(fileIdx);
			return "success";
		} catch (Exception e) {
			return "fail";
		}
	}
}
