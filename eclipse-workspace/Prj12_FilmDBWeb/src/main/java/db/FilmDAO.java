package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Film;

public class FilmDAO {

	private Connessione miaConn = new Connessione();
	private Statement istruzioniDB;
	private PreparedStatement istruzioniDBPreparate;
	private ResultSet risultatiQuery;
	
	private final String FILMS = "`film-animazione-pulito`";
	private final String FIND_ALL = "SELECT * FROM " + FILMS;

	public ArrayList<Film> getFilms() throws SQLException{
		
		//ho costruito un contenitore di film
		ArrayList<Film> tuttiFilm = new ArrayList<Film>();
		
		istruzioniDB = miaConn.getConn().createStatement();
		risultatiQuery = istruzioniDB.executeQuery(FIND_ALL);
		
		while (risultatiQuery.next()) {
			//each ciclo = un record -> creo un Film
			Film f = new Film();
			f.setId(risultatiQuery.getInt("id"));
			f.setTitolo(risultatiQuery.getString("titolo"));
			f.setAnno(risultatiQuery.getInt("anno"));
			f.setRating(risultatiQuery.getDouble("rating"));
			tuttiFilm.add(f);//aggiungiamo alla lista di film
			
		}
		
		return tuttiFilm;
	}
	
	
	
	
	
	
}
