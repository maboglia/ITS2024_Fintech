package testing;

import java.sql.SQLException;
import java.util.ArrayList;

import database.TitoloDAO;
import model.Titolo;

public class TitoliTester {

	public static void main(String[] args) throws SQLException {
		
		TitoloDAO dao = new TitoloDAO();
		
		ArrayList<Titolo> titoli = dao.getTitoli();
		
		for (Titolo titolo : titoli) {
			System.out.println(titolo);
		}

	}

}
