package model;

public class LibroPerBambini extends Libro {

	private int etaConsigliata;

	
	
	public int getEtaConsigliata() {
		return etaConsigliata;
	}

	public void setEtaConsigliata(int etaConsigliata) {
		this.etaConsigliata = etaConsigliata;
	}
	
	@Override
	public String getDescrizione() {
		
		return super.getDescrizione() + " età consigliata " + etaConsigliata;
	}
	
}
