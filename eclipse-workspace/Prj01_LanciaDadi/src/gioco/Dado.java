package gioco;

public class Dado {

	int facce = 6;
	int facciaUscita = 1;//camel case
	
	public void lancia() {
		
		facciaUscita = (int)(Math.random() * facce) + 1;
		
	}
	
	
}
