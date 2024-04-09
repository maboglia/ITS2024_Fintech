package test;

import java.util.ArrayList;

import controller.Biblioteca;
import model.Libro;

public class BibliotecaTest {

	public static void main(String[] args) {
		
		Biblioteca civica = new Biblioteca();
		
		Biblioteca nazionale = new Biblioteca();

		//libro 1
		Libro libro1 = new Libro();
		libro1.setTitolo("Il barone rampante");
		libro1.setAutore("Calvino");

		//libro 2
		Libro libro2 = new Libro("I malavoglia");
		libro2.setAutore("Verga");

		//libro 3
		Libro libro3 = new Libro("Io robot", "Asimov");
		
		civica.addLibro(libro1);//ho aggiunto un libro alla civica
		civica.addLibro(libro2);//ho aggiunto un libro alla civica
		civica.addLibro(libro3);//ho aggiunto un libro alla civica
		civica.addLibro(libro1);//ho aggiunto un libro alla civica
		civica.addLibro(libro2);//ho aggiunto un libro alla civica
		civica.addLibro(libro3);//ho aggiunto un libro alla civica
		System.out.println("Libri alla biblioteca civica: " + civica.contaLibri());
		
		nazionale.addLibro(libro1);
		nazionale.addLibro(libro2);
		nazionale.addLibro(libro3);
		nazionale.addLibro(libro1);
		nazionale.addLibro(libro2);
		
		System.out.println("Libri alla biblioteca nazionale: " + nazionale.contaLibri());
		
		ArrayList<Libro> libri = nazionale.getLibri();
		
				
//		for (Libro libro : libri) {
//			System.out.println(libro.getDescrizione());
//		}
		
		//libri.forEach(l -> System.out.println( l.getDescrizione()));
		
		
	}

}
