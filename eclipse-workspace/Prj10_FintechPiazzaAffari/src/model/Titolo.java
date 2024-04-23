package model;

public class Titolo {

	private int id;
	private String nomeTitolo;
	private String raccomandazione;
	private String capitalMLN;
	private int capitale;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeTitolo() {
		return nomeTitolo;
	}
	public void setNomeTitolo(String nomeTitolo) {
		this.nomeTitolo = nomeTitolo;
	}
	public String getRaccomandazione() {
		return raccomandazione;
	}
	public void setRaccomandazione(String raccomandazione) {
		this.raccomandazione = raccomandazione;
	}
	public String getCapitalMLN() {
		return capitalMLN;
	}
	public void setCapitalMLN(String capitalMLN) {
		this.capitalMLN = capitalMLN;
	}
	public int getCapitale() {
		return capitale;
	}
	public void setCapitale(int capitale) {
		this.capitale = capitale;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Titolo [id=");
		builder.append(id);
		builder.append(", nomeTitolo=");
		builder.append(nomeTitolo);
		builder.append(", raccomandazione=");
		builder.append(raccomandazione);
		builder.append(", capitalMLN=");
		builder.append(capitalMLN);
		builder.append(", capitale=");
		builder.append(capitale);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
