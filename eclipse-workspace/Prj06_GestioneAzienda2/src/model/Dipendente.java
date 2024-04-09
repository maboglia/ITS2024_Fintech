package model;

public abstract class Dipendente {
	
	private static int matricolatore = 1;
	
	//proprietà dei dipendenti
	protected int nMatricola;
	protected String nome;
	protected String cognome;
	protected double stipendio;
	protected String ruolo;
	
	
	public Dipendente(String nome, String cognome) {
		this.nMatricola = matricolatore++;
		this.nome = nome;
		this.cognome = cognome;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCognome() {
		return cognome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}


	public double getStipendio() {
		return stipendio;
	}


	public void setStipendio(double stipendio) {
		this.stipendio = stipendio;
	}


	public String getRuolo() {
		return ruolo;
	}


	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}


	public int getnMatricola() {
		return nMatricola;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Dipendente [nMatricola=");
		builder.append(nMatricola);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", cognome=");
		builder.append(cognome);
		builder.append(", stipendio=");
		builder.append(stipendio);
		builder.append(", ruolo=");
		builder.append(ruolo);
		builder.append("]");
		return builder.toString();
	}

	public abstract void calcolaStipendio();//senza corpo {}

	
	
}
