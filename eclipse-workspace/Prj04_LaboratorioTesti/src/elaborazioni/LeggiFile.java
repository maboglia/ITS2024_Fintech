package elaborazioni;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LeggiFile {
	
	public static void scrivi(String nomeFile, ArrayList<String> stringhe) throws FileNotFoundException {
		File f = new File(nomeFile);
		PrintWriter output = new PrintWriter(f);
		for (String string : stringhe) {
			output.println(string);
		}
		output.close();
	}
	
	public static void scrivi(String nomeFile, String stringa) throws FileNotFoundException {
		File f = new File(nomeFile);
		PrintWriter output = new PrintWriter(f);
		output.println(stringa);
		output.close();
	}

	public static String leggi(String nomeFile) throws FileNotFoundException {
		StringBuilder sb = new StringBuilder();
		File f = new File(nomeFile);
		Scanner input = new Scanner(f);
		
		while(input.hasNextLine()) {
			String riga = input.nextLine();
			sb.append(riga);
			sb.append("\n");
		}
		
		return sb.toString();
	}
	//overload (differenza per numero, posizione o tipo di parametro)
	public static ArrayList<String> leggi(String nomeFile, boolean b) throws FileNotFoundException {
		
		ArrayList<String> sb = new ArrayList<String>();
		File f = new File(nomeFile);
		Scanner input = new Scanner(f);
		
		while(input.hasNextLine()) {
			String riga = input.nextLine();
			sb.add(riga);
		}
		
		return sb;
	}	
	
}
