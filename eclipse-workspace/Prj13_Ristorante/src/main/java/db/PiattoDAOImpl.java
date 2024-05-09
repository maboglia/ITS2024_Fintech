package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Categoria;
import model.Piatto;

public class PiattoDAOImpl implements PiattoDAO{

	private Connessione miaConn = new Connessione();
	private Statement statement;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	@Override
	public List<Piatto> getPiatti() {
		List<Piatto> piatti = new ArrayList<>();

		try {
			statement = miaConn.getConn().createStatement();
			rs = statement.executeQuery(FIND_ALL);
			
			while(rs.next()) {
				
				Piatto p = new Piatto();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				p.setPrezzo(rs.getDouble("prezzo"));
				
				Categoria c = new Categoria();
				c.setId(rs.getInt("tipo_piatto_id"));
				p.setCategoria(c);
				
				piatti.add(p);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return piatti;
	}

}
