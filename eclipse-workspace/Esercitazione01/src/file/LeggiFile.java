package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeggiFile {

	public static void main(String[] args) {

		File canzoni = new File("C:\\Users\\m.bogliaccino\\Downloads\\canzoni2020.csv");
		
		try {
			Scanner input = new Scanner(canzoni);
			int counter = 0;
			while (input.hasNextLine()) {//gira finché la condizione è true
				counter++;
				if (counter == 1) continue;
				String riga = input.nextLine();
				
				String[] parole = riga.split(",");
				
				String titolo = parole[0];
				
				String cantanti = null;
				
				if (parole.length > 1)
					cantanti = parole[1];
				
				Canzone c = new Canzone(titolo, cantanti);
				
				System.out.println(c.stampa());
				
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
