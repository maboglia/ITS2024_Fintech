package view;

import java.util.List;

import model.Corso;
import repos.CorsoDAO;
import repos.CorsoDAOImpl;

public class CorsiDemo {

	public static void main(String[] args) {
		CorsoDAO dao = new CorsoDAOImpl();
		
		System.out.println(dao.getCorsoByCodice(1));
		
//		List<Corso> corsi = dao.getCorsi();//alt+shift+L
//
//		for (Corso corso : corsi) {
//			System.out.println(corso);
//		}
		
	}

}
