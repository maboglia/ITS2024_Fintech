package repos;

import java.util.List;

import model.Esame;

public interface EsameDAO {

	String FIND_ALL = "SELECT * FROM esami";
	String ADD_ESAME = "INSERT INTO esami (matricola, cod_corso, data, voto) VALUES (?,?,?,?)";
	
	List<Esame> getEsami();
	void addEsame(Esame e);
}
