package cloud.board.service;

import cloud.board.dao.BoardDAO;
import cloud.board.dto.BoardDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardRetrieveService implements BoardService {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String num = req.getParameter("num");
		BoardDAO dao = new BoardDAO();
		BoardDTO data = dao.retrieve(num);
		
		req.setAttribute("retrieve", data);;
	}
}
