package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lettore {

	public ArrayList<String> leggiFile(String nomeFile){
		
		ArrayList<String> lettura = new ArrayList<String>();//crei scatola vuota
		File fileDaLeggere = new File(nomeFile);
		try {
			Scanner input = new Scanner(fileDaLeggere);
			while (input.hasNextLine()) {
				lettura.add(input.nextLine());//riempi scatola
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lettura;//ritorni scatola piena
		
		
		
	}
	
	
}
