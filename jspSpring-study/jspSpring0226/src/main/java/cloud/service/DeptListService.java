package cloud.service;

import java.util.ArrayList;
import java.util.List;

import cloud.dao.DeptDAO;
import cloud.dto.DeptDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class DeptListService implements DeptService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		DeptDAO dao = new DeptDAO();
		List<DeptDTO> list = dao.list();
		request.setAttribute("list", list);
		
	}
}
