package leon.ssi.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connUtils {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/ssi";

	// Database credentials
	static final String USER = "user1";
	static final String PASS = "user1";

	public static Connection getConn() {
		Connection conn = null;

		// STEP 2: Register JDBC driver
		try {
			Class.forName(JDBC_DRIVER);
			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			conn.setAutoCommit(false);

		} catch (SQLException se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} catch (Exception e) {
			// Handle errors for Class.forName
			e.printStackTrace();
		}

		return conn;
	}
}
