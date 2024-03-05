package negozio;

public class Scontrino {

	String descrizione;
	Prodotto[] prodotti;
	double totale;
	
	Scontrino(){//Scontrino s = new Scontrino();
		totale = 0;
		prodotti = new Prodotto[10];//zero-based
		descrizione = "Negozio abbigliamento";
	}
	
	void addProdotto(int posizione, Prodotto p) {
		prodotti[posizione] = p;
	}
	
	String stampa() {
		
		String contenuto = "";
		
			contenuto += descrizione;
			contenuto += "\n";
			
			contenuto += "Elenco prodotti";
			contenuto += "\n";
			
			for(int i = 0; i < prodotti.length; i++) {
				Prodotto temp = prodotti[i];
				totale += temp.prezzo;
				
				contenuto += temp.stampa();
				contenuto += "\n";
			}//fine for
			contenuto += "Totale scontrino " + totale + "€";
		
		
		return contenuto;
	}
}
