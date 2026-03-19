package cloud.board.service;

import cloud.board.dao.BoardDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class BoardDeleteServive implements BoardService {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		String num = req.getParameter("num");
		BoardDAO dao = new BoardDAO();
		dao.delete(num);
	}
}
