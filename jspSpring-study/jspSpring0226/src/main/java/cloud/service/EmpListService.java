package cloud.service;

import java.util.List;

import cloud.dao.EmpDAO;
import cloud.dto.EmpDTO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class EmpListService implements EmpService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		EmpDAO dao = new EmpDAO();
		List<EmpDTO> list = dao.list();
		request.setAttribute("list", list);
	}
}
