package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String connectionString = "jdbc:mysql://localhost/fd";
		String userId = "root";
		String password = "";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(connectionString, userId, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return con;
		
	}
}
