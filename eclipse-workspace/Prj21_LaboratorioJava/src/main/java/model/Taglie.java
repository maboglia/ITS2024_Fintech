package model;

public enum Taglie {

	XS(38), S(40), M(44), L(48), XL(52);//sono 5 oggetti
	
	private int numero;
	
	private Taglie(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
}
