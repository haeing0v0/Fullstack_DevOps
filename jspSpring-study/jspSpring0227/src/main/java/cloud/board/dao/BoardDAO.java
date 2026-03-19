package cloud.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import cloud.board.dto.BoardDTO;
import cloud.board.utils.DBUtil;

public class BoardDAO {

	public ArrayList<BoardDTO> list() {
		ArrayList<BoardDTO> list = new ArrayList<BoardDTO>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String query = "SELECT num, author, title, content, date_format(writeday, '%Y.%m.%d') as writeday, readCnt, repRoot, repStep, repIndent FROM board ORDER BY repRoot DESC, repStep ASC";
		
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				BoardDTO data = new BoardDTO();
				data.setNum(rs.getInt("num"));
				data.setAuthor(rs.getString("author"));
				data.setTitle(rs.getString("title"));
				data.setContent(rs.getString("content"));
				data.setWriteday(rs.getString("writeday"));
				data.setReadCnt(rs.getInt("readCnt"));
				data.setRepRoot(rs.getInt("repRoot"));
				data.setRepStep(rs.getInt("repStep"));
				data.setRepIndent(rs.getInt("repIndent"));
				
				list.add(data);
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
	
	public void write(String _title, String _author, String _content) {
	      
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      int currval = 0;
	      
	      String sql = "SELECT ifnull(max(num), 0) + 1 FROM board";
	      
	      try {
	         conn = DBUtil.getConnection();
	         pstmt = conn.prepareStatement(sql);
	         rs = pstmt.executeQuery();
	         if (rs.next()) {
	            currval = rs.getInt(1);
	         }
	         
	         String query="INSERT INTO board(title, author, content, repRoot, repStep, repIndent) VALUES(?, ?, ?, '"+currval+"', 0, 0)";
	         
	         pstmt = conn.prepareStatement(query);
	         pstmt.setString(1, _title);
	         pstmt.setString(2, _author);
	         pstmt.setString(3, _content);
	         
	         int n = pstmt.executeUpdate();
	      } catch (Exception e) {
	         // TODO: handle exception
	         e.printStackTrace();
	      } finally {
	         try {
	            if(rs != null) rs.close();
	            if(pstmt != null) pstmt.close();
	            if(conn != null) conn.close();
	         } catch (Exception e2) {
	            // TODO: handle exception
	            e2.printStackTrace();
	         }
	      }
	   }
}
