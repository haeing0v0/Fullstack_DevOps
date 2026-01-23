package mainRun;

import dao.DeptDAO;
import dto.DeptDTO;

public class UpdateRun {
	public static void main(String[] args) {
		
		DeptDAO dao = new DeptDAO();
		
		DeptDTO dto = new DeptDTO();
        dto.setDeptno(50);       
        dto.setDname("INNOVATION"); 
        dto.setLoc("SEOUL");     

        int result = dao.update(dto); 

        if (result > 0) {
            System.out.println("데이터 수정 성공 : " + result);
        } else {
            System.out.println("데이터 수정 실패!!");
        }
	}
}