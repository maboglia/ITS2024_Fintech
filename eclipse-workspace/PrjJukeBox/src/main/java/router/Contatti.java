package router;

import java.io.IOException;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/contatti")
public class Contatti extends HttpServlet{

	public class Contatto{
		public String nome, cognome;

		public Contatto(String nome, String cognome) {
			this.nome = nome;
			this.cognome = cognome;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCognome() {
			return cognome;
		}

		public void setCognome(String cognome) {
			this.cognome = cognome;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Contatto [nome=");
			builder.append(nome);
			builder.append(", cognome=");
			builder.append(cognome);
			builder.append("]");
			return builder.toString();
		}
		
		
	}
	
	
	public Contatti() {
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Contatto c1 = new Contatto("pippo", "pippi");
		Contatto c2 = new Contatto("mario", "mari");
		Contatto c3 = new Contatto("gino", "gini");
		
		System.out.println(c1);;
		List.of(c1,c2,c3);
		JSONArray array = new JSONArray();
		JSONObject obj1 = new JSONObject(c1);
		JSONObject obj2 = new JSONObject(c2);
		JSONObject obj3 = new JSONObject(c3);
		
		array.put(obj1);
		array.put(obj2);
		array.put(obj3);
		resp.setContentType("application/json");
		
		resp.getWriter().print(array.toString());
	}
	
	
	
}
