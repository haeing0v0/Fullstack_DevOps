package cloud;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/LoginInfo")
public class LoginServlet extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // TODO Auto-generated method stub
      doPost(req, resp);
   }
   
   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      // TODO Auto-generated method stub
      String userid = req.getParameter("userid");
      String pwd1 = req.getParameter("pwd1");
      String pwd2 = req.getParameter("pwd2");
      String level = req.getParameter("level");
      String fullname = req.getParameter("fullname");
      String email = req.getParameter("email");
      String tel = req.getParameter("tel");
      
      resp.setContentType("text/html; charset=UTF-8");
      PrintWriter out = resp.getWriter();
      out.print("<html><body>");
      out.print("아이디 : " + userid + "<br>");
      out.print("패스워드 : " + pwd1 + "<br>");
      out.print("패스워드 확인 : " + pwd2 + "<br>");
      out.print("레벨 : " + level + "<br>");
      out.print("이름 : " + fullname + "<br>");
      out.print("전화 : " + tel + "<br>");
      out.print("</body></html>");
      
   }
}

