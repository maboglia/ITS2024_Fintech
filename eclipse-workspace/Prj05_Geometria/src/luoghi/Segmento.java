package luoghi;

public class Segmento {

	private Punto a, b;

	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
	}
	
	public double lunghezza() {
		
		return Math.sqrt( //radice q 
						Math.pow(a.getX()-b.getX(), 2) //diff delle x al q
						+ 
						Math.pow(a.getY()-b.getY(), 2)////diff delle y al q
				);
		
	}

	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + ", lunghezza()=" + lunghezza() + "]";
	}

	
	
	
}
