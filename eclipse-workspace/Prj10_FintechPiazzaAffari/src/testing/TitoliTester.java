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
			
			if (!titolo.getCapitalMLN().isEmpty()) {
				int capitale = Integer.parseInt(titolo.getCapitalMLN());
				
				dao.modificaTitoli(titolo.getId(), capitale);
			}
			System.out.println(titolo);
		}

	}

}
