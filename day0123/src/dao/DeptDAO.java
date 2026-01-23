package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbutil.DBUtil;
import dto.DeptDTO;

public class DeptDAO {

	public List<DeptDTO> select() {
		
		List<DeptDTO> list = new ArrayList<DeptDTO>();
		Connection conn = null; //DB 연결
		Statement stmt = null; //쿼리 작성
		ResultSet rs = null; //결과처리
		
		String query = "SELECT deptno, dname, loc FROM dept";
		
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
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
				if (rs != null) {
					rs.close();
				}
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return list;
	}
	
	public int insert(DeptDTO dto) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String query = "INSERT INTO dept(deptno, dname, loc) VALUES (?, ?, ?)";
		
		int result = 0;
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			//물음표 순서대로 입력
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			
			result = pstmt.executeUpdate();
			
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
		
		return result;
	}
	
	public int update(DeptDTO dto) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String query = "UPDATE dept SET dname = ?, loc = ? WHERE deptno = ?";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, dto.getDname());
	        pstmt.setString(2, dto.getLoc());
	        pstmt.setInt(3, dto.getDeptno());

	        result = pstmt.executeUpdate();
	        
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
		
		return result;
	}
	
	public int delete(DeptDTO dto) {
		int result = 0;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		String query = "DELETE FROM dept WHERE deptno = ?";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			
	        pstmt.setInt(1, dto.getDeptno());

	        result = pstmt.executeUpdate();
	        
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
		
		return result;
	}
}
