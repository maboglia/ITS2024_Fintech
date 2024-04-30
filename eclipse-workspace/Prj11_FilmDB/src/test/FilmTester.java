package test;

import java.sql.SQLException;
import java.util.ArrayList;

import db.FilmDAO;
import model.Film;

public class FilmTester {

	public static void main(String[] args) {

		FilmDAO dao = new FilmDAO();
		
		try {
			ArrayList<Film> films = dao.getFilms();
			
			for (Film f : films) {
				System.out.println(f);
			}
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
