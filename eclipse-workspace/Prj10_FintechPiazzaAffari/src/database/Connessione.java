package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	//parametri
	private final String URL = "jdbc:mysql://localhost:3307/its_2024";
	private final String USER = "ITS_2024";
	private final String PASS = "bogliaccino";
	
	private  Connection conn = null;
	
	//costruttore
	public Connessione() {
		connetti();
	}
	
	
	public Connection getConn() {
		return conn;
	}



	private void connetti() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Connesso al DB");
		} catch (SQLException e) {
			System.err.println("Non connesso al DB: " + e.getMessage());
		}
	}
	
}
