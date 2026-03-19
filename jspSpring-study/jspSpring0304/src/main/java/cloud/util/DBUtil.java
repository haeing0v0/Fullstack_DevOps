package cloud.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	private static final String URL = "jdbc:mysql://localhost:3306/cloud";
	private static final String USER = "root";
	private static final String PASSWORD = "1111";
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

	public static Connection getConnection() {

		Connection conn = null;

		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return conn;
	}
}