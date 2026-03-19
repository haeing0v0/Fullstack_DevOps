package cloud.student.service;

import java.util.ArrayList;

import cloud.student.dao.StudentDAO;
import cloud.student.dto.StudentDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentGetAllService implements StudentService {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
	
		StudentDAO dao = new StudentDAO();
		ArrayList<StudentDTO> students = dao.getAll();
		
		req.setAttribute("students", students);
	}
}
