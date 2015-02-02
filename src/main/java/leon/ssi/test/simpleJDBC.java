package leon.ssi.test;

import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class simpleJDBC {
	SimpleJdbcTemplate jdbc;

	public SimpleJdbcTemplate getJdbc() {
		return jdbc;
	}

	public void setJdbc(SimpleJdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
}
