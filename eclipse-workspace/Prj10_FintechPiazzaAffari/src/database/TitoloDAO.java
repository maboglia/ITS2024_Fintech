package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Titolo;

public class TitoloDAO {

	//Data Access Object = Oggetto che accede al Database
	
	private final String TABELLA = "fintech_piazzaaffari";
	private final String FIND_ALL = "SELECT * FROM " + TABELLA; 
	private final String FIND_BY_RACCOMANDAZIONE = "SELECT * FROM " + TABELLA + " WHERE raccomandazioni = ?";
	private final String ADD_TITOLO = "INSERT INTO " + TABELLA + " (titolo, capitalMLN) VALUES = (?,?)";
	private final String FIND_ONE = "SELECT * FROM " + TABELLA + " WHERE id = ";
	private final String UPDATE_TITOLO = "UPDATE " + TABELLA + " set capitale = ? WHERE id = ?";
	
	private Connessione miaConn = new Connessione();
	
	//oggetto che trasporta l'istruzione al database (statement)
	Statement istruzione;
	PreparedStatement istruzionePreparata;
	
	//oggetto che riceve i dati di una query
	ResultSet risultati;
	
	public ArrayList<Titolo> getTitoli() throws SQLException{
		ArrayList<Titolo> titoli = new ArrayList<>();
		
		istruzione = miaConn.getConn().createStatement();
		risultati = istruzione.executeQuery(FIND_ALL);
		
		while(risultati.next()) {
			
			Titolo t = new Titolo();//creo un titolo per ogni record del db
			t.setId(risultati.getInt("id"));
			t.setNomeTitolo(risultati.getString("titolo"));
			t.setRaccomandazione(risultati.getString("raccomandazioni"));
			t.setCapitalMLN(risultati.getString("capitalMLN"));
			titoli.add(t);//aggiungo il titolo alla collezione di titoli
		}
		
		return titoli;
	} 
	
	public ArrayList<Titolo> getTitoli(String raccomandazione) throws SQLException{
		ArrayList<Titolo> titoli = new ArrayList<>();
		
		istruzionePreparata = miaConn.getConn().prepareStatement(FIND_BY_RACCOMANDAZIONE);
		istruzionePreparata.setString(1, raccomandazione);//Binding parameters
		
		risultati = istruzionePreparata.executeQuery();
		
		while(risultati.next()) {
			
			Titolo t = new Titolo();//creo un titolo per ogni record del db
			t.setId(risultati.getInt("id"));
			t.setNomeTitolo(risultati.getString("titolo"));
			t.setRaccomandazione(risultati.getString("raccomandazioni"));
			t.setCapitalMLN(risultati.getString("capitalMLN"));
			titoli.add(t);//aggiungo il titolo alla collezione di titoli
		}
		
		return titoli;
	} 
	
	public void modificaTitoli(int idTitolo, int capitale) throws SQLException {
		istruzionePreparata = miaConn.getConn().prepareStatement(UPDATE_TITOLO);
		istruzionePreparata.setInt(1, capitale);
		istruzionePreparata.setInt(2, idTitolo);
		istruzionePreparata.execute();
		
	}
}
