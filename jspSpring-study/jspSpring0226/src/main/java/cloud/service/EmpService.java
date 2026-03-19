package cloud.service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface EmpService {
	
	public void execute(HttpServletRequest request, HttpServletResponse response);
	
}
