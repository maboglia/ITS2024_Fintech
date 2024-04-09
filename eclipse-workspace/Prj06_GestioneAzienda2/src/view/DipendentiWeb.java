package view;

import java.util.ArrayList;

import model.Dipendente;

public class DipendentiWeb {

	
	public String creaLista(ArrayList<Dipendente> dipendenti) {
		
		StringBuilder output = new StringBuilder();
		output.append("<ul>\n");
		
		for (Dipendente d : dipendenti) {
			//foreach dipendente della lista di dipendenti in argomento
			output.append("<li>");
			//qui i dati di ogni dipendente
			output.append(d.getNome() + " " + d.getCognome() + " " + d.getStipendio());
			
			output.append("</li>\n");
		}
		
		output.append("</ul>\n");		
		return output.toString();
	}
	
}
