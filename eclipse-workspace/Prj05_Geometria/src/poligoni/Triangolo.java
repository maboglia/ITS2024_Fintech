package poligoni;

import luoghi.Punto;
import luoghi.Segmento;

public class Triangolo extends Poligono {

	Punto a, b, c;
	Segmento ab, ac, bc;
	
	public Triangolo(Punto a, Punto b, Punto c) {
		super("Triangolo", 3, 3);//costruisce un poligono
		
		this.a = a;
		this.b = b;
		this.c = c;
		this.ab = new Segmento(a, b);
		this.ac = new Segmento(a, c);
		this.bc = new Segmento(b, c);
		this.perimetro = perimetro();
		this.area = area();
				
	}
	
	
	public double area() {
		
		double sp = this.perimetro / 2;
		return Math.sqrt(
				sp *
				(sp - ab.lunghezza()) *
				(sp - ac.lunghezza()) *
				(sp - bc.lunghezza()) 
				);
		
		
	}


	@Override
	public double perimetro() {
		return ab.lunghezza() + ac.lunghezza() + bc.lunghezza();
	}
}
