package cloud.student.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface StudentService {

	public void execute(HttpServletRequest req, HttpServletResponse resp);
}
