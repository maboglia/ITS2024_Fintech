package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CapoAbbigliamento;
import model.Maglia;
import services.CapiService;

import java.io.IOException;
import java.util.Collection;

import org.json.JSONArray;

/**
 * Servlet implementation class MaglieCtrl
 */
@WebServlet("/maglie")
public class MaglieCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private CapiService service;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaglieCtrl() {
       
    	this.service = new CapiService();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Collection<CapoAbbigliamento> capi = service.getCapi();
		
		JSONArray array = new JSONArray(capi);
		
			
			response.getWriter().print(array.toString());
			
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		if (request.getParameter("tipo")!=null) {
			String tipoCapo = request.getParameter("tipo");
			String prezzo = request.getParameter("prezzo");
			String taglia = request.getParameter("taglia");
			System.out.println(tipoCapo+prezzo+taglia);
			Maglia m1 = new Maglia();
			m1.setPrezzo(Double.parseDouble(prezzo));
			this.service.addCapo(m1);
			
		}

		
		doGet(request, response);
	}

}
