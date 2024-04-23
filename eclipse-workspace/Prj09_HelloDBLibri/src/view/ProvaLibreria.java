package view;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLException;

import controller.Libreria;
import model.Libro;

public class ProvaLibreria {

	public static void main(String[] args) {

		Libreria l1 = new Libreria();
	
		try {
			l1.riempiLibreriaDalDatabase();
			
			PrintWriter pw = new PrintWriter(new File("C:\\Users\\m.bogliaccino\\Desktop\\libri.html"));
			
			pw.println("<table>");
			pw.println("<tr>");
			
			pw.println("<th>Titolo</th>");
			pw.println("<th>Autore</th>");
			pw.println("<th>Editore</th>");
			pw.println("<th>Classificazione</th>");

			pw.println("</tr>");			
			
			for(Libro l : l1.getLibri()) {
				pw.println("<tr>");
				
				pw.println("<td>"+l.getTitolo()+"</td>");
				pw.println("<td>"+l.getAutore()+"</td>");
				pw.println("<td>"+l.getEditore()+"</td>");
				pw.println("<td>"+l.getClassificazione()+"</td>");

				pw.println("</tr>");

			}
			pw.println("</table>");
			
			pw.close();
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
