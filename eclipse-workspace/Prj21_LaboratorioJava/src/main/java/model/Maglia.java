package model;

public class Maglia extends CapoAbbigliamento {

	
	public Maglia() {
		super("maglia");
	}
	
	
	@Override
	public int compareTo(CapoAbbigliamento altraMaglia) {
		
		return Double.compare(this.getPrezzo(), altraMaglia.getPrezzo());
	}

}
