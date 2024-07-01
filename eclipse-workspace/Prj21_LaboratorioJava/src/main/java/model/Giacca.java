package model;

public class Giacca extends CapoAbbigliamento {

	public Giacca() {
		super("giacca");
	}

	@Override
	public int compareTo(CapoAbbigliamento o) {
		return Double.compare(this.getPrezzo(), o.getPrezzo());
	}

}
