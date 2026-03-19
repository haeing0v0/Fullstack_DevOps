package cloud.service;

import cloud.dao.NoticeDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeDeleteService implements NoticeService {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {

        int id = Integer.parseInt(request.getParameter("id"));

        NoticeDAO dao = new NoticeDAO();
        dao.delete(id);
    }
}