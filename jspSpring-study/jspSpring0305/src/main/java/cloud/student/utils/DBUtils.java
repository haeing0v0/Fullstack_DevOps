package cloud.student.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtils {

	private static final String URL ="jdbc:mysql://localhost:3306/cloud";
	private static final String USER ="root";
	private static final String PASSWORD ="1111";
	private static final String DRIVER ="com.mysql.cj.jdbc.Driver";
	
	public static Connection conn = null;
	public static PreparedStatement pstmt = null;
	public static ResultSet rs = null;
	
	public static Connection getConnection() {
		
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void close() {
		try {
			pstmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
