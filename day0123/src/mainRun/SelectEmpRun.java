package mainRun;

import java.util.List;

import dao.EmpDAO;
import dto.EmpDTO;

public class SelectEmpRun {
	public static void main(String[] args) {
		
		EmpDAO dao = new EmpDAO();
		List<EmpDTO> list = dao.select();
		
		System.out.println("==============================사원 목록 조회===============================");
		if (list.isEmpty()) {
			System.out.println("조회할 데이터가 없습니다.");
		} else {
			System.out.println("사원번호:\t 사원이름:\t 직업:\t mgr:\t 입사일:\t 급여:\t 보너스:\t 부서번호:\t");
			for (EmpDTO empDTO : list) {
				
				System.out.println(empDTO.getEmpno() + "\t" + empDTO.getEname() + "\t" +empDTO.getJob() + "\t" +empDTO.getMgr() + "\t" +empDTO.getHiredate() + "\t" +empDTO.getSal() + "\t" +empDTO.getComm() + "\t" +empDTO.getDeptno());
			}
		}
		System.out.println("========================================================================");
	}
}