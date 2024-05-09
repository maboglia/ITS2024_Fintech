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
	
}
