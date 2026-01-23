package mainRun;

import dao.DeptDAO;
import dto.DeptDTO;

public class DeleteRun {
	public static void main(String[] args) {
		
		DeptDAO dao = new DeptDAO();
		
		DeptDTO dto = new DeptDTO();
        dto.setDeptno(50);

        int result = dao.delete(dto); 

        if (result > 0) {
            System.out.println("데이터 삭제 성공 : " + dto.getDeptno());
        } else {
            System.out.println("데이터 삭제 실패!!");
        }
	}
}