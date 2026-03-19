package cloud.board.service;

import java.util.ArrayList;

import cloud.board.dao.BoardDAO;
import cloud.board.dto.BoardDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardListService implements BoardService {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardDTO> list = dao.list();
		
		req.setAttribute("list", list);
	}
}






