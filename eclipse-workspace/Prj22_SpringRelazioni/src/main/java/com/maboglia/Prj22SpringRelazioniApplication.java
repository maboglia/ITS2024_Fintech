package com.maboglia;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.maboglia.entities.Corso;
import com.maboglia.entities.Libretto;
import com.maboglia.entities.Studente;
import com.maboglia.services.StudentiService;

@SpringBootApplication
public class Prj22SpringRelazioniApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prj22SpringRelazioniApplication.class, args);
	}

	//@Bean
	public CommandLineRunner gira(StudentiService service) {
		
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				//creo 2 studenti
				Studente s = new Studente();
				Studente s2 = new Studente();
				//creo 2 libretti
				Libretto l = new Libretto();
				Libretto l2 = new Libretto();
				
				//creo un corso
				Corso c = new Corso();
				c.setId(1L);
				c.setNome("Fondamenti di Eclipse");
				
				s.setId(1L);
				s.setNome("Giulio");
				s.setLibretto(l);
				s.setCorso(c);
				
				s2.setId(2L);
				s2.setNome("Andrea");
				s2.setLibretto(l2);
				s2.setCorso(c);
				
				l.setId(1L);
				l.setNumeroMatricola("GLVA12");
				l.setStudente(s);

				l2.setId(2L);
				l2.setNumeroMatricola("ANDR12");
				l2.setStudente(s2);	
				
				service.addCorso(c);
				service.addStudente(s);
				service.addLibretto(l);
				
				service.addStudente(s2);
				service.addLibretto(l2);
				
				c.getStudenti().add(s);
				c.getStudenti().add(s2);
				
				
			}
		};
		
		
	}
	
	
}
