package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/", "/home", "/index"})
public class Router extends HttpServlet {

	public Router() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String titolo = "home";
		//collego header
		req.getRequestDispatcher("header.jsp").include(req, resp);;
		
		if (req.getParameter("pagina")!=null) {
			String pagina = req.getParameter("pagina");
			
			switch(pagina) {
			case "primi":
				titolo = "primi";
				break;
			default:
				
				break;
			
			}
			
			
			
			
		}
		System.out.println(titolo);
		req.setAttribute("titolo", titolo);
		req.getRequestDispatcher("content.jsp").include(req, resp);;
		//collego header
		req.getRequestDispatcher("footer.jsp").include(req, resp);;
	
	}
	
}
