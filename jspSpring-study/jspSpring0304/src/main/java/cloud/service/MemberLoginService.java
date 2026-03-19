package cloud.service;

import cloud.dao.MemberDAO;
import cloud.dto.MemberDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class MemberLoginService implements MemberService {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {

        String userId = request.getParameter("userId");
        String userPwd = request.getParameter("userPwd");

        MemberDAO dao = new MemberDAO();
        MemberDTO dto = dao.login(userId, userPwd);

        if(dto != null) {
            HttpSession session = request.getSession();
            session.setAttribute("loginUser", dto);
        }

        request.setAttribute("dto", dto);
    }
}