package luoghi;

public class Punto {

	//proprietà, attributi, fields
	//stato interno dell'oggetto
	private int x, y;

	//overload metodi costruttori
	public Punto() {
		this.x = 0;
		this.y = 0;
	}
	
	public Punto(int x) {
		this.x = x;
		this.y = 0;
	}
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	//getters, setters
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")"; // (3, 2)
	}
	
	
	
	
	
	
}
