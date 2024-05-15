package model;

public class Corso {

	private int codCorso;
	private String nomeCorso;
	private int crediti;
	private int codDocente;
	
	public int getCodCorso() {
		return codCorso;
	}
	public void setCodCorso(int codCorso) {
		this.codCorso = codCorso;
	}
	public String getNomeCorso() {
		return nomeCorso;
	}
	public void setNomeCorso(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}
	public int getCrediti() {
		return crediti;
	}
	public void setCrediti(int crediti) {
		this.crediti = crediti;
	}
	public int getCodDocente() {
		return codDocente;
	}
	public void setCodDocente(int codDocente) {
		this.codDocente = codDocente;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Corso [codCorso=");
		builder.append(codCorso);
		builder.append(", nomeCorso=");
		builder.append(nomeCorso);
		builder.append(", crediti=");
		builder.append(crediti);
		builder.append(", codDocente=");
		builder.append(codDocente);
		builder.append("]");
		return builder.toString();
	}
	
	
}
