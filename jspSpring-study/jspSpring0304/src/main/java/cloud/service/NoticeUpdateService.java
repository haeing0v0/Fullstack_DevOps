package cloud.service;

import cloud.dao.NoticeDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeUpdateService implements NoticeService {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {

        int id = Integer.parseInt(request.getParameter("id"));
        String title = request.getParameter("title");
        String content = request.getParameter("content");

        NoticeDAO dao = new NoticeDAO();
        dao.update(id, title, content);
    }
}