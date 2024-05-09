package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Piatto;
import services.RistoranteService;

@WebServlet("/piatti")
public class RistoranteCtrl extends HttpServlet {

	private RistoranteService service = new RistoranteService();

	@Override
	protected void doGet(HttpServletRequest richiesta, HttpServletResponse risposta) throws ServletException, IOException {
	
		List<Piatto> allPiatti = service.getAllPiatti();
		
		risposta.setContentType("text/html");
		risposta.getWriter().print("<h1>Piatti del giorno</h1>");
		
		for (Piatto piatto : allPiatti) {
			risposta.getWriter().print("<p>"+piatto.getNome() + "</p>");
			
		}
		
		
	}
	
	
	
	
}
