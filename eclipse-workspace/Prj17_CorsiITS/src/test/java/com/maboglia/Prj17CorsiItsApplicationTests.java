package com.maboglia;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.maboglia.entities.LibrettoUniversitario;
import com.maboglia.entities.Studente;
import com.maboglia.services.ITSService;

@SpringBootTest
class Prj17CorsiItsApplicationTests {

	@Autowired
	private ITSService service;
	
	@Test
	void contextLoads() {
	
		Studente s = new Studente(); 
		LibrettoUniversitario lu = new LibrettoUniversitario();
		
		lu.setNumeroMatricola("ABC123");
		lu.setStudente(s);
		s.setNome("mauro");
		s.setLibrettoUniversitario(lu);
	
		service.addStudente(s);
		service.addLibretto(lu);
		
		Assertions.assertEquals(1, service.getStudenti().size());
	
	}

}
