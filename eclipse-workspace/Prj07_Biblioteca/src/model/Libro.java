package model;

public class Libro {

	private String titolo;
	private String autore;
	private boolean inPrestito;
	
	//costruttori - overload
	public Libro() {
		this.inPrestito = false;
	}
	
	public Libro(String titolo) {
		this();
		this.titolo = titolo;
	}
	
	public Libro(String titolo, String autore) {
		this(titolo);
		this.autore = autore;
	}



	//getters setters
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public boolean isInPrestito() {
		return inPrestito;
	}
	public void setInPrestito(boolean inPrestito) {
		this.inPrestito = inPrestito;
	}

	public String getDescrizione() {
		return "Libro: " + this.titolo + " " + this.autore;
	}
	
}
