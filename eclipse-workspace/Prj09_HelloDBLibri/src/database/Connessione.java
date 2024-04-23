package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	//----------------------------------------
	private final String URL = "jdbc:mysql://localhost:3307/its_2024";
	private final String USER = "ITS_2024";
	private final String PASS = "bogliaccino";
	//----------------------------------------

	private Connection conn = null;
	
	public Connection getConn() {
		return conn;
	}
	
	public void connetti() {
		try {
			this.conn = DriverManager.getConnection(URL, USER, PASS);
			//System.out.println("sei connesso");
			
		} catch (SQLException e) {
			System.err.println("Hai un problema nella connessione: " + e.getMessage());
		}
	}
	
	
}
