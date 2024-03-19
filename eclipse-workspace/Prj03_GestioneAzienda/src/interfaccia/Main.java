package interfaccia;

import java.util.Scanner;

import its.Azienda;
import its.Impiegato;

public class Main {

	public static void main(String[] args) {

		boolean gira = true;
		Scanner input = new Scanner(System.in);
		Azienda generica = null;
		
		
		while(gira) {
			
			System.out.println("Cosa vuoi fare?");
			System.out.println("A) Crea nuova Azienda");
			System.out.println("B) Aggiungi dipendente");
			System.out.println("C) Calcola stipendi");
			System.out.println("D) Lista dipendenti");
			System.out.println("X) Esci");
			String risposta = input.nextLine();
			System.out.println(risposta);
			
			switch (risposta.toUpperCase()) {
			case "A":
				System.out.println("Quanti dipendenti ha l'azienda");
				int dipendenti = input.nextInt();
				input.nextLine();
				generica = new Azienda(dipendenti);
				break;
			case "B":
				if (generica != null) {
					System.out.println("Nome del dipendente");
					String nome = input.nextLine();
					System.out.println("Cognome del dipendente");
					String cognome = input.nextLine();
					System.out.println("Anno di nascita del dipendente");
					int annoNascita = input.nextInt();
					input.nextLine();
					Impiegato generico = new Impiegato(nome, cognome, annoNascita);
					System.out.println("Quanti denari gli dai?");
					int stipendio = input.nextInt();
					input.nextLine();
					generico.setStipendio(stipendio);
					generica.addImpiegato(generico);
				}
				break;
			case "C":
				if (generica != null) {
					System.out.println("Lo stipendio totale è");
					System.out.println(generica.calcolaStipendi());
				}
				
				break;
			case "D":
				if (generica != null) {
					System.out.println("<h1>L'elenco dei dipendenti è</h1>");
					System.out.println("<ol>");
					System.out.println(generica.stampaDipendenti());
					System.out.println("</ol>");
				}
				
				break;
			case "X":
					//vuole uscire
					System.out.println("bye!");
					gira = false;
				
				break;
				
			default:
				System.out.println("La tua scelta " + risposta + " non è corretta!");
				break;
			}
			
			
			
			
			
		}
		
//		System.out.println("Sei uscito dal tunnel");
//		
//		Azienda aziendaAgricolaPippo = new Azienda(5); 
//		
//		Impiegato imp1 = new Impiegato("Paolo", "Rossi", 2000); 
//		Impiegato imp2 = new Impiegato("Piero", "Fossi", 1998); 
//		Impiegato imp3 = new Impiegato("Francesca", "Dossi", 2002); 
//		
//		imp1.setStipendio(1500);
//		imp2.setStipendio(1800);
//		imp3.setStipendio(1600);
//		
//		aziendaAgricolaPippo.addImpiegato(imp1);
//		aziendaAgricolaPippo.addImpiegato(imp2);
//		aziendaAgricolaPippo.addImpiegato(imp3);
//
//		System.out.println("Lo stipendio totale è");
//		System.out.println(aziendaAgricolaPippo.calcolaStipendi());
		
	}

}
