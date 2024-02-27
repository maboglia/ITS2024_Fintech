package gioco;

public class LanciaDadi {

	public static void main(String[] args) {
		
		Dado d1 = new Dado();
		Dado d2 = new Dado();

		final int NUMERO_LANCI = 1000_000_000;
		int vittorie = 0;
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < NUMERO_LANCI; i++) {//inizia ciclo for
			d1.lancia();
			d2.lancia();
			
			//System.out.println("Il dado 1 vale " + d1.facciaUscita);

			//System.out.println("Il dado 2 vale " + d2.facciaUscita);
			
			if (d1.facciaUscita == d2.facciaUscita) {
				vittorie++;
				//System.out.println("Hai vinto!!!!!!!");
			}
		}//finisce ciclo for
		long stop = System.currentTimeMillis();
		
		System.out.println("Hai giocato " + NUMERO_LANCI + " volte");
		System.out.println("Hai vinto " + vittorie + " volte");
		double percentuale = (double) vittorie / NUMERO_LANCI * 100;
		System.out.println("La percentuale di vitorie è " + percentuale);
		System.out.println("Il tempo impiegato nell'elaborazione è di: " + (stop-start));
				
		

	}

}
