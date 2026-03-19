package cloud.service;

import cloud.dao.MemberDAO;
import cloud.dto.MemberDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MemberInsertService implements MemberService {

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) {

        String userId = request.getParameter("userId");
        String userPwd = request.getParameter("userPwd");
        String userName = request.getParameter("userName");

        MemberDTO dto = new MemberDTO();
        dto.setUserId(userId);
        dto.setUserPwd(userPwd);
        dto.setUserName(userName);

        MemberDAO dao = new MemberDAO();
        int result = dao.insert(dto);

        request.setAttribute("result", result);
    }
}