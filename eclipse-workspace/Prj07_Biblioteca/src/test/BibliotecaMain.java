package test;

import java.util.Scanner;

import controller.Biblioteca;
import model.Libro;

public class BibliotecaMain {

	public static void main(String[] args) {
		Biblioteca biblio = new Biblioteca();
		Scanner canon = new Scanner(System.in);
		boolean gira = true;
		String risposta = null;
		
		do {
			menu();
			risposta = canon.nextLine();

			switch (risposta) {
			case "0":
				gira = false;
				break;
			case "1":
				System.out.println("Vuoi aggiungere un libro");
//				Libro l = creaLibro();
				biblio.addLibro(creaLibro());
				break;
			case "2":
				System.out.println("Vuoi contare i libri");
				System.out.println("I libri in biblioteca sono: " + biblio.contaLibri());
				break;
			case "3":
				System.out.println("Elenco dei libri");

				for(Libro librettino : biblio.getLibri()) {
					System.out.println(librettino.getDescrizione());
				}
				
				break;

			default:
				System.out.println("Devi scegliere tra le opzioni disponibili");
				break;
			}
			
			
		} while (gira);
		
		System.out.println("Programma terminato");
	}

	//metodo ausiliario 
	private static void menu() {
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Biblioteca Civica");
		System.out.println("-----------------");
		System.out.println("1) Add Libro");
		System.out.println("2) Count Libri");
		System.out.println("3) List Libri");
		System.out.println("0) Esci");
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	private static Libro creaLibro() {
		Scanner epson = new Scanner(System.in);
		Libro l = new Libro();
		System.out.println("Dimmi il titolo del libro");
		String titolo = epson.nextLine();
		l.setTitolo( titolo );
		System.out.println("Dimmi l'autore");
		l.setAutore(epson.nextLine());
		return l;
	}
}
