package model;

public class Direttore extends Dipendente {

	private double pagaBase;
	
	public Direttore(String nome, String cognome) {
		super(nome, cognome);//la prima cosa da fare

		this.ruolo = "Direttore";
	}

	@Override
	public void calcolaStipendio() {
		this.stipendio = pagaBase;
		
	}

	public double getPagaBase() {
		return pagaBase;
	}

	public void setPagaBase(double pagaBase) {
		this.pagaBase = pagaBase;
	}
	
}
