package cloud.service;

import cloud.dao.NoticeDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeWriteService implements NoticeService {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {

        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String writer = request.getParameter("writer");

        NoticeDAO dao = new NoticeDAO();
        dao.write(title, content, writer);
    }
}