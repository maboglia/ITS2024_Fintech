package controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.Connessione;
import model.Libro;

public class Libreria {

	private ArrayList<Libro> libri;//dichiarazione
	
	public Libreria() {
		libri = new ArrayList<>();//inizializzazione
	}
	
	
	
	public ArrayList<Libro> getLibri() {
		return libri;
	}



	public void riempiLibreriaDalDatabase() throws SQLException {
		
		Connessione c = new Connessione();
		c.connetti();
		Connection conn = c.getConn();//connessione al db
		
		String query = "SELECT * FROM libri";//query per il db
		
		Statement bustaContenenteIstruzione = conn.createStatement();
		ResultSet risultatiDellaQuery = bustaContenenteIstruzione.executeQuery(query);
		
		while(risultatiDellaQuery.next()) {
			Libro l = new Libro();//creo un libro vuoto
			l.setId(risultatiDellaQuery.getInt("id"));
			l.setTitolo(risultatiDellaQuery.getString("titolo"));
			l.setAutore(risultatiDellaQuery.getString("autore"));
			l.setEditore(risultatiDellaQuery.getString("editore"));
			l.setClassificazione(risultatiDellaQuery.getString("classificazione"));
			l.setAnno(risultatiDellaQuery.getInt("anno"));
			//System.out.println(l);
			libri.add(l);//aggiungo questo libro all'array di libri
		}
	}
	
	
}
