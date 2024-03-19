package its;

/*
 * SEGRETERIA
Definire una classe Segreteria che ci permette (dato un nome, un cognome ed un anno di nascita) di creare un ID Questa classe ha un solo metodo statico. In particolare il metodo:

creaID (String n, String c, Int a) che prende 2 stringhe ed un intero (in particolare saranno un nome, un cognome e l'età) e ritorna una Stringa formata dalla concatenazione di: le prime 2 lettere di n, le prime 2 lettere di c, a (esempio: con l'input “paolo”, “rossi”, 1995 ritorna come risultato: paro1995).
 */

public class Segreteria {

	public static String creaId(String nome, String cognome, int annoNascita) {
		
		return nome.substring(0, 2) + cognome.substring(0, 2) + annoNascita;
		
		
	}
	
}
