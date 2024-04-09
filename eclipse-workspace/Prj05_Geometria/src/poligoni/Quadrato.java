package poligoni;

import luoghi.Segmento;

public class Quadrato extends Rettangolo {

	Segmento lato;
	
	public Quadrato(Segmento lato) {
		super(lato, lato);
		this.nome = "Quadrato";
		this.lato = lato;
		System.out.println(lato);
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.pow(base.lunghezza(), 2);
	}


	
	
}
