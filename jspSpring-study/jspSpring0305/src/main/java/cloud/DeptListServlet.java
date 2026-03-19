package cloud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/deptList")
public class DeptListServlet extends HttpServlet {

   private static final String URL ="jdbc:mysql://localhost:3306/cloud";
   private static final String USER ="root";
   private static final String PASSWORD ="1111";
   private static final String DRIVER ="com.mysql.cj.jdbc.Driver";

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doPost(req, resp);
   }

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

      resp.setContentType("text/html; charset=UTF-8");
      PrintWriter out = resp.getWriter();

      out.print("<html><body>");
      out.print("<h2>DEPT 테이블 조회</h2>");
      out.print("<table border='1'>");
      out.print("<tr>");
      out.print("<th>deptno</th>");
      out.print("<th>dname</th>");
      out.print("<th>loc</th>");
      out.print("</tr>");

      try {
         Class.forName(DRIVER);

         Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
         Statement stmt = conn.createStatement();

         String sql = "SELECT * FROM dept";
         ResultSet rs = stmt.executeQuery(sql);

         while (rs.next()) {

            int deptno = rs.getInt("deptno");
            String dname = rs.getString("dname");
            String loc = rs.getString("loc");

            out.print("<tr>");
            out.print("<td>" + deptno + "</td>");
            out.print("<td>" + dname + "</td>");
            out.print("<td>" + loc + "</td>");
            out.print("</tr>");
         }

         rs.close();
         stmt.close();
         conn.close();
      } catch (Exception e) {
         e.printStackTrace();
      }

      out.print("</table>");
      out.print("</body></html>");
   }
}