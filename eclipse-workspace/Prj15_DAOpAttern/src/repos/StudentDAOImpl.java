package repos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Student;

public class StudentDAOImpl implements StudentDAO {

	private Connessione miaConn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public StudentDAOImpl() {
		miaConn = new Connessione();
	}
	
	@Override
	public List<Student> findAll() {

		List<Student> studenti = new ArrayList<>();
		
		try {
			ps = miaConn.getConn().prepareStatement(FIND_ALL);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				int matricola = rs.getInt("matricola");
				String nome = rs.getString("nome");
				String cognome = rs.getString("cognome");
				Student s = new Student();
				s.setMatricola(matricola);
				s.setNome(nome);
				s.setCognome(cognome);
				studenti.add(s);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return studenti;
	}

	@Override
	public Student findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
