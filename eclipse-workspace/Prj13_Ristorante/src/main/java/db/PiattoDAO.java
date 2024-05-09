package db;

import java.util.List;

import model.Piatto;

public interface PiattoDAO {
	
	//implicitamente public e final
	String FIND_ALL = "SELECT * FROM piatti";
	
	//metodi implicitamente public e abstract
	List<Piatto> getPiatti();

}
