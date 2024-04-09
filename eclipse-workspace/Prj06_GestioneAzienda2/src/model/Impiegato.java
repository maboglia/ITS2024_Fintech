package model;

public class Impiegato extends Dipendente {

	private int oreLavoro;
	private double pagaBase;
	
	public Impiegato(String nome, String cognome) {
		super(nome, cognome);//la prima cosa da fare

		this.ruolo = "Impiegato";
	}

	@Override
	public void calcolaStipendio() {
		this.stipendio = oreLavoro * pagaBase;
		
	}

	public int getOreLavoro() {
		return oreLavoro;
	}

	public void setOreLavoro(int oreLavoro) {
		this.oreLavoro = oreLavoro;
	}

	public double getPagaBase() {
		return pagaBase;
	}

	public void setPagaBase(double pagaBase) {
		this.pagaBase = pagaBase;
	}

	
	
}
