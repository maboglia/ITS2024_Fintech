package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CapoAbbigliamento;
import model.*;
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
			
			CapoAbbigliamento capo = null;
		
		if (request.getParameter("tipo")!=null) {
			String tipoCapo = request.getParameter("tipo");
			
			
			switch (tipoCapo) {
				case "maglia":
					capo = new Maglia();
					break;
				case "giacca":
					capo = new Giacca();
					break;	
				case "pantalone":
					capo = new Pantalone();
					break;	
				default:
					break;
			}
					
			String prezzo = request.getParameter("prezzo");
			String taglia = request.getParameter("taglia");
			System.out.println(tipoCapo+prezzo+taglia);
			
			capo.setPrezzo(Double.parseDouble(prezzo));
			capo.setTaglia(Taglie.valueOf(taglia));
			this.service.addCapo(capo);
			
		}

		
		doGet(request, response);
	}

}
