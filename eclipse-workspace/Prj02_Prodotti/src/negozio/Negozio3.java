package negozio;

public class Negozio3 {

	public static void main(String[] args) {

		Scontrino s1 = new Scontrino();
		
		Prodotto p1 = new Prodotto(1, "Giacca rossa", 10);
		Prodotto p2 = new Prodotto(2, "Giacca blu", 11);
		Prodotto p3 = new Prodotto(3, "Giacca verde", 12);
		Prodotto p4 = new Prodotto(4, "Giacca gialla", 13);
		Prodotto p5 = new Prodotto(5, "Giacca rosa", 14);

		Prodotto p6 = new Prodotto(6, "Maglia rossa", 20);
		Prodotto p7 = new Prodotto(7, "Maglia blu", 21);
		Prodotto p8 = new Prodotto(8, "Maglia verde", 22);
		Prodotto p9 = new Prodotto(9, "Maglia gialla", 33);
		Prodotto p10 = new Prodotto(10, "Maglia rosa", 44);
		
		s1.addProdotto(0, p1);
		s1.addProdotto(1, p2);
		s1.addProdotto(2, p3);
		s1.addProdotto(3, p4);
		s1.addProdotto(4, p5);
		s1.addProdotto(5, p6);
		s1.addProdotto(6, p7);
		s1.addProdotto(7, p8);
		s1.addProdotto(8, p9);
		s1.addProdotto(9, p10);
		
		System.out.println(s1.stampa());
		

	}

}
