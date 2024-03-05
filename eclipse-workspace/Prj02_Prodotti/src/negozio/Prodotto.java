package negozio;

public class Prodotto {//PascalCase

	int codProdotto;//camelCase
	String nome;
	double prezzo;
	
	public Prodotto( int codice, String _nome, double _prezzo    ) {
		codProdotto = codice;
		nome = _nome;
		prezzo = _prezzo;

	}
	
	String stampa() {
		return "Il prodotto ( " +
				codProdotto +
				" ) " +
				nome +
				" costa " +
				prezzo +
				"€";
	}
	
}
