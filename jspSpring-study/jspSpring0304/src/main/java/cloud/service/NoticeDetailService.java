package cloud.service;

import cloud.dao.NoticeDAO;
import cloud.dto.NoticeDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NoticeDetailService implements NoticeService {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {

        int id = Integer.parseInt(request.getParameter("id"));

        NoticeDAO dao = new NoticeDAO();
        dao.increaseHit(id);

        NoticeDTO dto = dao.detail(id);
        request.setAttribute("dto", dto);
    }
}