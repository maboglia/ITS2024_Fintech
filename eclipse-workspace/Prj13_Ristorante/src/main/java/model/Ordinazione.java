package model;

public class Ordinazione {

	//campi della tabella ordinazione
	//attributi
	private int id;
	private Piatto primo;
	private Piatto secondo;
	private Piatto dessert;
	private Piatto bevanda;
	private double prezzo;
	//no costruttore
	
	
	//getters, setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Piatto getPrimo() {
		return primo;
	}
	public void setPrimo(Piatto primo) {
		this.primo = primo;
	}
	public Piatto getSecondo() {
		return secondo;
	}
	public void setSecondo(Piatto secondo) {
		this.secondo = secondo;
	}
	public Piatto getDessert() {
		return dessert;
	}
	public void setDessert(Piatto dessert) {
		this.dessert = dessert;
	}
	public Piatto getBevanda() {
		return bevanda;
	}
	public void setBevanda(Piatto bevanda) {
		this.bevanda = bevanda;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	
}
