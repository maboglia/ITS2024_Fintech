package file;

public class Canzone {

	String titolo;
	String cantanti;
	
	public Canzone(String titolo, String cantanti) {//metodo costruttore - inizia per maiuscola
		this.titolo = titolo;
		this.cantanti = cantanti;
	}
	
	public String stampa() {
		
		return "La canzone " + this.titolo + " è cantata da " + this.cantanti;
	}
}
