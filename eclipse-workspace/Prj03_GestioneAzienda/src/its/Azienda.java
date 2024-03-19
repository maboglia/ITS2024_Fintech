package its;

/*
 * La classe Azienda conserva il riferimento a tutti gli impiegati e può calcolare lo stipendio totale di tutti essi. Quindi ha come attributi:

un array di Impiegati;
numero massimo di impiegati;
numero attuale di impiegati. Ha come metodi:
un metodo addImpiegato( ... ): aggiunge un impiegato all'array (se non è già pieno);
un metodo stipendioTOT( ): calcola lo stipendio totale come somma di tutti gli stipendi.
 */

public class Azienda {
	
	private Impiegato[] impiegati;
	private int massimo;
	private int attuale;
	
	public Azienda(int massimo) {//new Azienda(10)
		this.massimo = massimo;
		this.impiegati = new Impiegato[massimo];
		this.attuale = 0;
	}

	public void addImpiegato(Impiegato i) {
		if (attuale < massimo) {
			this.impiegati[attuale]= i;
			this.attuale++;//incremento il valore di attuale
		}else {
			System.out.println("posti esauriti");
		}
		
		
	}
	
	public int calcolaStipendi() {
		
		int totale = 0;
		
		for (int i = 0; i < impiegati.length; i++) {
			if (impiegati[i] != null) {
				totale += impiegati[i].getStipendio();
			}
		}
		
		return totale;
	}

	public String stampaDipendenti() {
		StringBuilder sb = new StringBuilder();
		
		for (Impiegato impiegato : impiegati) {
			sb.append("<li>");
			sb.append(impiegato.getNome());
			sb.append("</li>");
		}
		
		
		return sb.toString();
	}
	
	
	
	
	
	
	
	
	
	
}
