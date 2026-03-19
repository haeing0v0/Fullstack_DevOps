package cloud.service;

import java.util.List;

import cloud.dao.MemberDAO;
import cloud.dto.MemberDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberListService implements MemberService {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {
        MemberDAO dao = new MemberDAO();
        List<MemberDTO> list = dao.list();
        request.setAttribute("list", list);
    }
}