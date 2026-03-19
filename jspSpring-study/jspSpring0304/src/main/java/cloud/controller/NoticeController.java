package cloud.controller;

import java.io.IOException;

import cloud.service.NoticeDeleteService;
import cloud.service.NoticeDetailService;
import cloud.service.NoticeListService;
import cloud.service.NoticeService;
import cloud.service.NoticeUpdateService;
import cloud.service.NoticeWriteService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class NoticeController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("UTF-8");

        String requestURI = req.getRequestURI();
        String contextPath = req.getContextPath();
        String urlName = requestURI.substring(contextPath.length());

        NoticeService service = null;
        String nextPage = null;

        if (urlName.equals("/list.do")) {
            service = new NoticeListService();
            service.execute(req, resp);
            nextPage = "/list.jsp";
            RequestDispatcher dis = req.getRequestDispatcher(nextPage);
            dis.forward(req, resp);
            return;
        }

        if (urlName.equals("/writeui.do")) {
            nextPage = "/write.jsp";
            RequestDispatcher dis = req.getRequestDispatcher(nextPage);
            dis.forward(req, resp);
            return;
        }

        if (urlName.equals("/write.do")) {
            service = new NoticeWriteService();
            service.execute(req, resp);
            resp.sendRedirect("list.do");
            return;
        }

        if (urlName.equals("/detail.do")) {
            service = new NoticeDetailService();
            service.execute(req, resp);
            nextPage = "/detail.jsp";
            RequestDispatcher dis = req.getRequestDispatcher(nextPage);
            dis.forward(req, resp);
            return;
        }

        if (urlName.equals("/updateui.do")) {
            service = new NoticeDetailService();
            service.execute(req, resp);
            nextPage = "/update.jsp";
            RequestDispatcher dis = req.getRequestDispatcher(nextPage);
            dis.forward(req, resp);
            return;
        }

        if (urlName.equals("/update.do")) {
            service = new NoticeUpdateService();
            service.execute(req, resp);
            resp.sendRedirect("detail.do?id=" + req.getParameter("id"));
            return;
        }

        if (urlName.equals("/delete.do")) {
            service = new NoticeDeleteService();
            service.execute(req, resp);
            resp.sendRedirect("list.do");
            return;
        }
    }
}