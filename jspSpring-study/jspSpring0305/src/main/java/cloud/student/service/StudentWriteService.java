package cloud.student.service;

import cloud.student.dao.StudentDAO;
import cloud.student.dto.StudentDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentWriteService implements StudentService {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		StudentDTO st = new StudentDTO();
		st.setUsername(req.getParameter("username"));
		st.setUniv(req.getParameter("univ"));
		st.setBirth(req.getParameter("birth"));
		st.setEmail(req.getParameter("email"));
		
		StudentDAO dao = new StudentDAO();
		dao.insert(st);
	}
}


