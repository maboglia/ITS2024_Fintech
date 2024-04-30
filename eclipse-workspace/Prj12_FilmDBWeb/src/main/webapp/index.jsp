<!DOCTYPE html>
<%@page import="java.sql.SQLException"%>
<%@page import="model.Film"%>
<%@page import="java.util.ArrayList"%>
<%@page import="db.FilmDAO"%>
<html>
<head>
<meta charset="utf-8">
<title>Films</title>
</head>
<body>

	<h1>I miei film di animazione</h1>

	<%

	FilmDAO dao = new FilmDAO();
	
	try {
		ArrayList<Film> films = dao.getFilms();
		out.print("<ul>");
		
		for (Film f : films) {
			
			out.println("<li>" + f.getTitolo() + "</li>");
		}
		
		out.print("</ul>");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	%>

</body>
</html>