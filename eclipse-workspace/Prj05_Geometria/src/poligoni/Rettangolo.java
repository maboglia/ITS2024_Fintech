package poligoni;

import luoghi.Segmento;

public class Rettangolo extends Poligono {

	Segmento base, altezza;
	
	public Rettangolo(Segmento base, Segmento altezza) {
		super("Rettangolo", 4,4);
		this.base = base;
		this.altezza = altezza;
		this.perimetro = perimetro();
		this.area = this.area();
	}
	
	
	@Override
	public double perimetro() {
		return 2 * (base.lunghezza() + altezza.lunghezza());
	}

	@Override
	public double area() {
		return base.lunghezza() * altezza.lunghezza();
	}

}
