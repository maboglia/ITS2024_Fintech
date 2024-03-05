package negozio;

public class Negozio {

	public static void main(String[] args) {
		
		Prodotto p1 = new Prodotto();//costruito un oggetto di tipo Prodotto

		p1.codProdotto = 1;
		p1.nome = "Giacca";
		p1.prezzo = 19.99;
		
		System.out.println(p1.stampa());
		
		Prodotto p2 = new Prodotto();//costruito un oggetto di tipo Prodotto

		p2.codProdotto = 2;
		p2.nome = "Maglia";
		p2.prezzo = 9.99;
		
		System.out.println(p2.stampa());	
		
		System.out.println("--------------------");
		
		System.out.println("Totale scontrino");
		
		double totale = p1.prezzo + p2.prezzo;
		
		System.out.println( Math.round(totale) );
		
		
		
		
	}

}
