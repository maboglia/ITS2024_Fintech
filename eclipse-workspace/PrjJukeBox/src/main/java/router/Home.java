package router;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class Home extends HttpServlet{

	public Home() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.getRequestDispatcher("header.jsp").include(req, resp);
		req.getRequestDispatcher("menu.jsp").include(req, resp);
		resp.getWriter().print("Ciao, benvenuto nel sito web");
		req.getRequestDispatcher("footer.jsp").include(req, resp);

	}
	
	
	
}
