package db;

import java.sql.SQLException;
import java.sql.Statement;

public class ConnessioneDemo {

	public static void main(String[] args) {
		Connessione miaConn = new Connessione();
		
		

		String query = "CREATE TABLE ordinazioni ("
				+ " id INT AUTO_INCREMENT PRIMARY KEY,"
				+ " primo_piatto VARCHAR(100),"
				+ " prezzo_primo DECIMAL(5, 2),"
				+ " secondo_piatto VARCHAR(100),"
				+ " prezzo_secondo DECIMAL(5, 2),"
				+ " dessert VARCHAR(100),"
				+ " prezzo_dessert DECIMAL(5, 2),"
				+ " bevanda VARCHAR(100),"
				+ " prezzo_bevanda DECIMAL(5, 2)"
				+ ");"
				+ "";
		
		//query = "DROP TABLE ordinazioni";
		
		try {
			Statement statement = miaConn.getConn().createStatement();
			statement.execute(query);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
