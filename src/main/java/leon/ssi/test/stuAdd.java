package leon.ssi.test;

import java.sql.SQLException;
import java.sql.Statement;

public class stuAdd {

	connUtils conn;

	public connUtils getConn() {
		return conn;
	}

	public void setConn(connUtils conn) {
		this.conn = conn;
	}

	public void insertStuent() {
		Statement stmt = null;
		try {
			stmt = conn.getConn().createStatement();
			String sql;
			sql = "INSERT INTO t_student (student_id,student_name) VALUES ('77','d11');";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
