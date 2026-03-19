package cloud.controller;

import java.io.IOException;

import cloud.service.MemberInsertService;
import cloud.service.MemberListService;
import cloud.service.MemberLoginService;
import cloud.service.MemberLogoutService;
import cloud.service.MemberService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/member/*")
public class MemberController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String path = req.getPathInfo(); 
        if (path == null) path = "";

        MemberService service = null;
        String nextPage = null;

        if (path.equals("/list.do")) {
            service = new MemberListService();
            service.execute(req, resp);

            nextPage = "/memberList.jsp";
            RequestDispatcher dis = req.getRequestDispatcher(nextPage);
            dis.forward(req, resp);
            return;
        }

        if (path.equals("/joinui.do")) {
            nextPage = "/join.jsp";
            RequestDispatcher dis = req.getRequestDispatcher(nextPage);
            dis.forward(req, resp);
            return;
        }

        if (path.equals("/join.do")) {
            service = new MemberInsertService();
            service.execute(req, resp);

            resp.sendRedirect(req.getContextPath() + "/member/list.do");
            return;
        }

        if (path.equals("/loginui.do")) {
            nextPage = "/login.jsp";
            RequestDispatcher dis = req.getRequestDispatcher(nextPage);
            dis.forward(req, resp);
            return;
        }

        if (path.equals("/login.do")) {
            service = new MemberLoginService();
            service.execute(req, resp);

            nextPage = "/loginResult.jsp";
            RequestDispatcher dis = req.getRequestDispatcher(nextPage);
            dis.forward(req, resp);
            return;
        }

        if (path.equals("/logout.do")) {
            service = new MemberLogoutService();
            service.execute(req, resp);

            resp.sendRedirect(req.getContextPath() + "/member/loginui.do");
            return;
        }

        resp.sendError(HttpServletResponse.SC_NOT_FOUND);
    }
}