package cloud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cloud.dto.EmpDTO;
import cloud.util.DBUtil;

public class EmpDAO {

public List<EmpDTO> list() {
		
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM emp";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				EmpDTO dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("Comm"));
				dto.setDeptno(rs.getInt("deptno"));
				
				list.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return list;
	}
}
