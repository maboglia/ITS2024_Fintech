package db;

import java.util.List;

import model.Piatto;

public interface PiattoDAO {
	
	//implicitamente public e final
	String FIND_ALL = "SELECT * FROM piatti";
	String FIND_ONE = "SELECT * FROM piatti WHERE id = ?";
	String ADD = "INSERT INTO piatti (nome, prezzo, tipo_piatto_id) VALUES (?,?,?) ";
	
	//metodi implicitamente public e abstract
	List<Piatto> getPiatti();
	Piatto getPiattoById(int id);
	void addPiatto(Piatto p);

}
