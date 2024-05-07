package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String URL = "jdbc:mysql://localhost:3307/its_2024";
	private final String USER = "ITS_2024";
	private final String PASS = "bogliaccino";
	
	private Connection conn = null;
	
	public Connection getConn() {
	
		if (conn == null) {
			connetti();
		}
		
		return conn;
	}

	private void connetti() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connesso al DB");
		} catch (SQLException e) {
			System.err.println("Non connesso al DB " + e.getMessage());
		}
		
	}
	
}
