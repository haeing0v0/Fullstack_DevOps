package cloud.service;

import cloud.dao.DeptDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeptWriteService implements DeptService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int deptno = Integer.parseInt(request.getParameter("deptno"));
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		
		DeptDAO dao = new DeptDAO();
		dao.write(deptno, dname, loc);
		
	}
}
