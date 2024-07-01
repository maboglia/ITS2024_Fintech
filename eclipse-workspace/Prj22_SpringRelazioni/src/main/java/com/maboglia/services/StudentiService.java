package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.*;

public interface StudentiService {

	List<Studente> getStudenti();
	List<Libretto> getLibretti();
	List<Corso> getCorsi();
	
	Libretto addLibretto(Libretto l);
	Studente addStudente(Studente s);
	Corso addCorso(Corso c);
	
}
