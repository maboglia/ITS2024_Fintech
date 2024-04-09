package demo;



import luoghi.Punto;
import luoghi.Segmento;
import poligoni.Poligono;
import poligoni.Quadrato;
import poligoni.Rettangolo;
import poligoni.Triangolo;

public class GeometriaDemo {

	public static void main(String[] args) {
		Punto a = new Punto(3,2);
		Punto b = new Punto(7,2);
		Punto c = new Punto(3,5);
		
		Segmento ab = new Segmento(a, b);//4
		Segmento ac = new Segmento(a, c);//3
		Segmento bc = new Segmento(b, c);//5
		
//		Poligono p1 = new Poligono("triangolo", 3, 3);
		
		Poligono bagno1 = new Triangolo(a, b, c);//6
		Poligono cucina = new Rettangolo(ab, ac);//12
		Poligono salaDaPranzo = new Rettangolo(ab, ac);//12
		Poligono cameraDaLetto = new Rettangolo(ab, ac);//12
		Poligono studio = new Quadrato(ab);//16
		
		Poligono[] APPARTAMENTO = {bagno1, cucina,salaDaPranzo, cameraDaLetto,studio};
		
		double superficieTotale = 0;
		for (Poligono stanza : APPARTAMENTO) {
			superficieTotale += stanza.area();
		}
		System.out.printf("La superficie totale dell'appartamento è : %f", superficieTotale);
		System.out.println();
	
		
//		System.out.println(ab + " - " + ab.lunghezza());
//		System.out.println(ac);
//		System.out.println(bc);
		
//		System.out.println("Il valore di x " + a.getX());
//		a.setY(7);
//		System.out.println("Il valore di y " + a.getY());
//		
//		System.out.println(a);

	}

}
