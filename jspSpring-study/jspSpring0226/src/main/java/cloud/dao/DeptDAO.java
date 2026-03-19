package cloud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cloud.dto.DeptDTO;
import cloud.util.DBUtil;

public class DeptDAO {

	public List<DeptDTO> list() {
		
		List<DeptDTO> list = new ArrayList<DeptDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "SELECT * FROM dept";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				DeptDTO dto = new DeptDTO();
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				
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
	
	public void write(int _deptno, String _dname, String _loc) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String query = "INSERT INTO dept(deptno, dname, loc) VALUES(?, ?, ?)";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, _deptno);
			pstmt.setString(2, _dname);
			pstmt.setString(3, _loc);
			
			int n = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
