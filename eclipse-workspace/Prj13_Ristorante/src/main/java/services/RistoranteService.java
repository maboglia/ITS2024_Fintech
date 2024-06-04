package services;

import java.util.List;

import db.PiattoDAO;
import db.PiattoDAOImpl;
import model.Piatto;

public class RistoranteService {

	private PiattoDAO dao = new PiattoDAOImpl();
	
	public List<Piatto> getAllPiatti(){
		return dao.getPiatti();
	} 
	
	public Piatto getPiattoById(int id) {
		return dao.getPiattoById(id);
	}

	public void addPiatto(Piatto p) {
		dao.addPiatto(p);
		
	}
	
}
