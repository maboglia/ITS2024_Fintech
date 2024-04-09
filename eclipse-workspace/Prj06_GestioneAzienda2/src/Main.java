import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

import controller.Azienda;
import model.Dipendente;
import model.Direttore;
import model.Dirigente;
import model.Fattorino;
import model.Impiegato;
import util.Lettore;

public class Main {

	public static void main(String[] args) {
		Azienda azienda1 = new Azienda("Luxottica");
		
		azienda1.addDipendente("Stefania", "Bordino", "Fattorino");
		azienda1.getDipendenteById(1).setStipendio(250);
		
		azienda1.addDipendente(new Impiegato("Davide", "Botta"));
		azienda1.getDipendenteById(2).setStipendio(240);
		ArrayList<Dipendente> dipendenti = azienda1.getDipendenti();
		
//		for (Dipendente dipendente : dipendenti) {
//			System.out.println(dipendente);
//		}
		
		//System.out.println(azienda1.listaStipendi());
		
		Lettore l1 = new Lettore();
		
		ArrayList<String> letturaFile = l1.leggiFile("files/dipendenti.csv");
		for (String riga : letturaFile) {
			//spezzo la riga in parti
			String[] split = riga.split(",");
			String nome = split[0];
			String cognome = split[1];
			String ruolo = split[3];
			int numero = Integer.parseInt(split[2]);
			
			if (ruolo.equals("i")) {
				Impiegato i = new Impiegato(nome, cognome);
				i.setOreLavoro(numero);
				i.setPagaBase(10);
				azienda1.addDipendente(i);
			} else 
			if (ruolo.equals("f")) {
				Fattorino f = new Fattorino(nome, cognome);
				f.setNumeroConsegne(numero);
				f.setPagaBase(8);
				azienda1.addDipendente(f);
			} 
			else 
			if (ruolo.equals("d")) {
				Dirigente d = new Dirigente(nome, cognome);
				d.setPagaBase(3000);
				azienda1.addDipendente(d);
			}
			else 					
			if (ruolo.equals("a")) {
				Direttore d = new Direttore(nome, cognome);
				d.setPagaBase(4000);
				azienda1.addDipendente(d);
			}
			
			
		}
		azienda1.calcolaStipendi();
		System.out.println(azienda1.listaStipendi());
		
		File f = new File("files/cedolino_marzo.html");
		try {
			PrintWriter output = new PrintWriter(f);
			output.write(azienda1.listaStipendi());
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}//chiusura main()

}//fine classe main
