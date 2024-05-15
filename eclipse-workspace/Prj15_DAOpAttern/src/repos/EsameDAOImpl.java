package repos;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.Corso;
import model.Esame;
import model.Student;

public class EsameDAOImpl implements EsameDAO {

	private Connessione miaConn = new Connessione();
	private PreparedStatement ps;
	private ResultSet rs;
	
	private CorsoDAO daoCorsi = new CorsoDAOImpl();
	private StudentDAO daoStudenti = new StudentDAOImpl();
	
	
	@Override
	public List<Esame> getEsami() {
		List<Esame> esami = new ArrayList<Esame>(); 

		try {
			ps = miaConn.getConn().prepareStatement(FIND_ALL);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				Esame e = new Esame();
				
				int matricola = rs.getInt("matricola");
				int voto = rs.getInt("voto");
				int codCorso = rs.getInt("cod_corso");
				Date date = rs.getDate("data");
				
				Corso corso = daoCorsi.getCorsoByCodice(codCorso);
				Student studente = daoStudenti.findById(matricola);
				LocalDate dataEsame = date.toLocalDate();
				
				e.setCorso(corso);
				e.setData(dataEsame);
				e.setStudente(studente);
				e.setVoto(voto);
				
				esami.add(e);
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return esami;
	}

	@Override
	public void addEsame(Esame e) {
		try {
			ps = miaConn.getConn().prepareStatement(ADD_ESAME);
			//matricola, cod_corso, data, voto
			ps.setInt(1, e.getStudente().getMatricola());
			ps.setInt(2, e.getCorso().getCodCorso());
			ps.setDate(3, Date.valueOf(e.getData()));
			ps.setInt(4, e.getVoto());

			ps.execute();
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
