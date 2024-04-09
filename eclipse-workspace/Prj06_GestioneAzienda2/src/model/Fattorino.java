package model;

public class Fattorino extends Dipendente {

	private int numeroConsegne;
	private double pagaBase;
	
	public Fattorino(String nome, String cognome) {
		super(nome, cognome);//la prima cosa da fare

		this.ruolo = "Fattorino";
	}

	@Override
	public void calcolaStipendio() {
		this.stipendio = numeroConsegne * pagaBase;
		
	}

	public int getNumeroConsegne() {
		return numeroConsegne;
	}

	public void setNumeroConsegne(int numeroConsegne) {
		this.numeroConsegne = numeroConsegne;
	}

	public double getPagaBase() {
		return pagaBase;
	}

	public void setPagaBase(double pagaBase) {
		this.pagaBase = pagaBase;
	}

}
