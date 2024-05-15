package view;

import java.time.LocalDate;
import java.util.List;

import model.Esame;
import repos.CorsoDAO;
import repos.CorsoDAOImpl;
import repos.EsameDAO;
import repos.EsameDAOImpl;
import repos.StudentDAO;
import repos.StudentDAOImpl;

public class EsamiDemo {

	public static void main(String[] args) {

		EsameDAO dao = new EsameDAOImpl();
		StudentDAO daoStudent = new StudentDAOImpl();
		CorsoDAO corsoDAO = new CorsoDAOImpl();
		
		//List<Esame> esami = dao.getEsami();

		//dao.getEsami().forEach(System.out::println);
		
		Esame e = new Esame();
		e.setData(LocalDate.now());
		e.setVoto(30);
		e.setStudente(daoStudent.findById(3));
		e.setCorso(corsoDAO.getCorsoByCodice(3));
		
		dao.addEsame(e);
		
		
		
	}

}
