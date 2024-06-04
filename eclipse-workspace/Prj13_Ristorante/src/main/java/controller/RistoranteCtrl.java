package controller;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Categoria;
import model.Piatto;
import services.RistoranteService;

@WebServlet("/piatti")// endpoint / route
public class RistoranteCtrl extends HttpServlet {

	private RistoranteService service = new RistoranteService();

	@Override
	protected void doGet(HttpServletRequest richiesta, HttpServletResponse risposta) throws ServletException, IOException {
	
		if (richiesta.getParameter("id")!=null) {

			int id = Integer.parseInt(richiesta.getParameter("id"));
			Piatto p = service.getPiattoById(id);
			
			risposta.setContentType("text/html");
			risposta.getWriter().print("<h1>Piatto scelto </h1>");
			risposta.getWriter().print(p.getNome());
			
		} else {
			List<Piatto> allPiatti = service.getAllPiatti();
			
			risposta.setContentType("text/html");
			risposta.getWriter().print("<h1>Piatti del giorno</h1>");
			
			for (Piatto piatto : allPiatti) {
				risposta.getWriter().print("<p>"+piatto.getNome() + "</p>");
				
			}
			
			
		}
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if (req.getParameter("nome")!=null) {
			
			String nome = req.getParameter("nome");
			double prezzo = Double.parseDouble(req.getParameter("prezzo"));
			int idCategoria = Integer.parseInt(req.getParameter("categoria"));
			Piatto p = new Piatto();
			p.setNome(nome);
			p.setPrezzo(prezzo);
			
			//TODO: da sistemare col DAO categorie
			Categoria c = new Categoria();
			c.setId(idCategoria);
			c.setNome("primi");
			p.setCategoria(c);
			
			service.addPiatto(p);
		}
		
	}
	
	
}
