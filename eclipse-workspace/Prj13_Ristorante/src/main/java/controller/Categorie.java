package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/categorie")
public class Categorie extends HttpServlet {

	private int counter = 1;
	
	
	public Categorie() {
		System.out.println("Servlet categorie costruita");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String risposta ="Mi hai chiamato via GET " + counter++;
		
		if (req.getParameter("pagina")!=null) {
			
			String pagina = req.getParameter("pagina");
			resp.getWriter()
				.print("Mi hai passato un valore per il paramtetro pagina " + pagina);
			
		}
		
		
		resp.getWriter().print(risposta);
		
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String risposta ="Mi hai chiamato via POST " + counter++;
		
		if (req.getParameter("nome_categoria")!=null) {
			String categoria = req.getParameter("nome_categoria");
			
			resp.getWriter().println(categoria);
		}
		
		resp.getWriter().print(risposta);
		
	}
}
