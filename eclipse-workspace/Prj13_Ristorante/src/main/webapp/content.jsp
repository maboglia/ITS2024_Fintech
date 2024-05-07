	<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="db.Connessione"%>
<h1>Menu del ristorante</h1>

<% 
	
	String pagina = "home";

	String query = "select * from studenti";
	
	ArrayList<String> risultato = new ArrayList<>();
	
	if (request.getParameter("pagina") != null){
		pagina = request.getParameter("pagina");
	}

	switch(pagina){
	
	case "primi":
		%>
		<%@ include file="primi.html" %>
		<%
		break;
	case "secondi":
		query = "select * from piatti where tipo_piatto = 'secondi'";
		break;
	case "dessert":
		
		break;
	case "bevande":
		
		break;	
	default:
		
		Connessione miaConn = new Connessione();
		Statement statement = miaConn.getConn().createStatement();
		ResultSet rs = statement.executeQuery(query);
		
		
		while(rs.next()){
			risultato.add(rs.getString("cognome"));
		}
		
		
		out.print("<h1>" + pagina + "</h1>");
		break;
	
	}



%>




	
	<form action="" method="post">
	
		<input type="text" name="prova" placeholder="Scrivi qualcosa">
		<input type="submit" value="clicca qui per andare in pausa">
	
	</form>
	
	<%
	
		for (String studente : risultato){
			out.print("<h2>" + studente + "</h2>");
		}
	
	
	%>