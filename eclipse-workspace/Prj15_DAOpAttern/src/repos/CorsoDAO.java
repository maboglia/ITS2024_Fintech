package repos;

import java.util.List;

import model.Corso;

public interface CorsoDAO {

	String TROVA_TUTTI = "SELECT * FROM corsi";
	String TROVA_UN_CORSO = "SELECT * FROM corsi WHERE cod_corso = ?";
	
	List<Corso> getCorsi();
	Corso getCorsoByCodice(int codice);
	
	
}
