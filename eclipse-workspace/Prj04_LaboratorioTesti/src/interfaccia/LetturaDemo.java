package interfaccia;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import elaborazioni.LeggiFile;

public class LetturaDemo {

	public static void main(String[] args) {
		
		try {
			ArrayList<String> risposta = LeggiFile.leggi("W:\\FSD_23-25\\comune\\studenti.csv", true);
			String query = "";
			
			query += "<h1>Studenti Fintech 2024</h1>\n";
			
			query += "<ul>\n";
			for (String riga : risposta) {
				String[] parole = riga.split(",");
				String nome = parole[0];
				String cognome = parole[1];
				 query += "<li>" + nome + " " + cognome + "</li>\n";
				
				//System.out.println(query);
			}
			query += "</ul>\n";
			
			LeggiFile.scrivi("W:\\FSD_23-25\\comune\\studenti.html", query);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println("Si è verificato un errore nella lettura del file");
			System.err.println(e.getMessage());
		}
		System.out.println("Programma terminato");

	}

}
