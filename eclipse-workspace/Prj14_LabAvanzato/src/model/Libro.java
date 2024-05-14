package model;

public class Libro implements Comparable<Libro>  {

	private String titolo;
	private int pagine;
	private double prezzo;
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public int getPagine() {
		return pagine;
	}
	public void setPagine(int pagine) {
		this.pagine = pagine;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	@Override
	public int compareTo(Libro altroLibro) {
		// TODO Auto-generated method stub
		
		return Double.compare(this.prezzo, altroLibro.prezzo);
		
		//return this.titolo.compareTo(altroLibro.titolo);
		
		//return this.pagine - altroLibro.pagine;
		//100   - 100 = 0
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [titolo=");
		builder.append(titolo);
		builder.append(", pagine=");
		builder.append(pagine);
		builder.append(", prezzo=");
		builder.append(prezzo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
