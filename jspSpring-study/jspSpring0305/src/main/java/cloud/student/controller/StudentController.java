package cloud.student.controller;

import java.io.IOException;

import cloud.student.service.StudentGetAllService;
import cloud.student.service.StudentService;
import cloud.student.service.StudentWriteService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class StudentController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String requestURI = req.getRequestURI();
		String contextPath = req.getContextPath();
		String uriName = requestURI.substring(contextPath.length());
		
		StudentService service = null;
		String nextPage = null;
		
		if (uriName.equals("/studentList.do")) {
			service = new StudentGetAllService();
			service.execute(req, resp);
			nextPage = "studentInfo.jsp";
		}
		
		if (uriName.equals("/studentwriteui.do")) {
			nextPage = "studentwriteui.jsp";
		}
		
		if (uriName.equals("/studentwrite.do")) {
			service = new StudentWriteService();
			service.execute(req, resp);
			nextPage = "studentList.do";
		}
		
		RequestDispatcher dis = req.getRequestDispatcher(nextPage);
		dis.forward(req, resp);
	}
}






