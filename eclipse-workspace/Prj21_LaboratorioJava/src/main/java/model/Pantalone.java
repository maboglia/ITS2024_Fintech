package model;

public class Pantalone extends CapoAbbigliamento {

	public Pantalone() {
		super("pantalone");
	}

	@Override
	public int compareTo(CapoAbbigliamento o) {
		return Double.compare(this.getPrezzo(), o.getPrezzo());
	}

}
