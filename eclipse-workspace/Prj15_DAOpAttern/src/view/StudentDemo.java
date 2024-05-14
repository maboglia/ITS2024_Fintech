package view;

import java.util.List;

import model.Student;
import repos.StudentDAO;
import repos.StudentDAOImpl;

public class StudentDemo {

	public static void main(String[] args) {

		StudentDAO dao = new StudentDAOImpl();
		
		List<String> studentiFiltrati =  dao.findAll()
			.stream()
			.filter(s -> s.getNome().endsWith("o"))
			.filter(s -> s.getCognome().toLowerCase().startsWith("r"))
			.map(s -> s.getCognome())
			.toList();
			//.forEach(System.out::println);//consumes / collect
		
		studentiFiltrati.forEach(System.out::println);

	}

}
