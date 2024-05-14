package repos;

import java.util.List;

import model.Student;

public interface StudentDAO {

	String FIND_ALL = "select * from studenti";
	String FIND_BY_ID = "select * from studenti where id = ?";
	
	List<Student> findAll();
	Student findById(int id);
	
}
