package cloud.student.dao;

import java.util.ArrayList;

import cloud.student.dto.StudentDTO;
import cloud.student.utils.DBUtils;

public class StudentDAO {

	public ArrayList<StudentDTO> getAll() {
		
		ArrayList<StudentDTO> students = new ArrayList<StudentDTO>();
		
		try {
			DBUtils.conn = DBUtils.getConnection();
			DBUtils.pstmt = DBUtils.conn.prepareStatement("SELECT * FROM student");
			DBUtils.rs = DBUtils.pstmt.executeQuery();
			
			while (DBUtils.rs.next()) {
				StudentDTO st = new StudentDTO();
				st.setId(DBUtils.rs.getInt("id"));
				st.setUsername(DBUtils.rs.getString("username"));
				st.setUniv(DBUtils.rs.getString("univ"));
				st.setBirth(DBUtils.rs.getString("birth"));
				st.setEmail(DBUtils.rs.getString("email"));
				
				students.add(st);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtils.close();
		}
		
		return students;
	}
	
	public void insert(StudentDTO st) {
		
		String sql = "INSERT INTO student(username, univ, birth, email) VALUES(?, ?, ?, ?)";
		
		try {
			DBUtils.conn = DBUtils.getConnection();
			DBUtils.pstmt = DBUtils.conn.prepareStatement(sql);
			DBUtils.pstmt.setString(1, st.getUsername());
			DBUtils.pstmt.setString(2, st.getUniv());
			DBUtils.pstmt.setString(3, st.getBirth());
			DBUtils.pstmt.setString(4, st.getEmail());
			
			int n = DBUtils.pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DBUtils.close();
		}
	}
}













