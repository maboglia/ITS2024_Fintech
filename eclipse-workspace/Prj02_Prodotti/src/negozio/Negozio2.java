package negozio;

import java.util.Scanner;

public class Negozio2 {

	public static void main(String[] args) {
		
		System.out.println("Cosa vuoi comprare?");
		
		Scanner input  = new Scanner(System.in);
		
		String cosaDaComprare = input.nextLine();
		
		System.out.println("Hai detto che vuoi comprare ");
		System.out.println(cosaDaComprare); 
		
	}
	
}
