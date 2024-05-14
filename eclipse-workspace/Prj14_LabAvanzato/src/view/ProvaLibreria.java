package view;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import controller.Libreria;
import model.Libro;

class ComparatorePrezzo implements Comparator<Libro>{

	@Override
	public int compare(Libro libro1, Libro libro2) {
		
		return Double.compare(libro2.getPrezzo(), libro1.getPrezzo());
	}
	
}


public class ProvaLibreria {

	public static void main(String[] args) {
		
		Libreria feltrinelli1 = new Libreria("Feltrinelli");
		
		feltrinelli1.addLibro("Gianna bianca", 300, 10);
		feltrinelli1.addLibro("Anna bianca", 120, 12);
		feltrinelli1.addLibro("Panda bianca", 200, 6);
		
		List<Libro> libri = feltrinelli1.getLibri();
		
		List<String> nomi = List.of("Pippo", "Zippo", "Gippo");
			
		
		//Collections.sort(libri, (l1, l2) -> Double.compare(l1.getPrezzo(), l2.getPrezzo()));
		
		libri
			.stream()
			.sorted()
			.forEach(l -> System.out.println(l));
		
//		for (Libro libro : libri) {
//			System.out.println(libro.getTitolo() + libro.getPrezzo());
//		}
		
	}
	
}
