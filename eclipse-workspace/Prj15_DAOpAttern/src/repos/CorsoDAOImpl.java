package repos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Corso;

public class CorsoDAOImpl implements CorsoDAO {

	private Connessione miaConn = new Connessione();
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	@Override
	public List<Corso> getCorsi() {
		List<Corso> corsi = new ArrayList<Corso>();
		
		try {
			ps = miaConn.getConn().prepareStatement(TROVA_TUTTI);
			rs = ps.executeQuery();
			while (rs.next()) {
				Corso c = new Corso();
				c.setNomeCorso(rs.getString("nome_corso"));
				corsi.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return corsi;
	}


	@Override
	public Corso getCorsoByCodice(int codice) {
		try {
			ps = miaConn.getConn().prepareStatement(TROVA_UN_CORSO);
			ps.setInt(1, codice);
			rs = ps.executeQuery();
			
			boolean next = rs.next(); 
			
			if (next) {
				Corso c = new Corso();
				c.setNomeCorso(rs.getString("nome_corso"));
				c.setCodCorso(rs.getInt("cod_corso"));
				return c;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return null;
	}

}
