package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Corso;
import com.maboglia.entities.Libretto;
import com.maboglia.entities.Studente;
import com.maboglia.repos.CorsoDAO;
import com.maboglia.repos.LibrettoDAO;
import com.maboglia.repos.StudenteDAO;

@Service
public class StudentiServiceImpl implements StudentiService {

	@Autowired
	private StudenteDAO studenteDAO;
	
	@Autowired
	private LibrettoDAO librettoDAO;
	
	@Autowired
	private CorsoDAO corsoDAO;
	
	@Override
	public List<Studente> getStudenti() {
		return studenteDAO.findAll();
	}

	@Override
	public List<Libretto> getLibretti() {
		return librettoDAO.findAll();
	}

	@Override
	public Libretto addLibretto(Libretto l) {
		return librettoDAO.save(l);
	}

	@Override
	public Studente addStudente(Studente s) {
		return studenteDAO.save(s);
	}

	@Override
	public List<Corso> getCorsi() {
		return corsoDAO.findAll();
	}

	@Override
	public Corso addCorso(Corso c) {
		return corsoDAO.save(c);
	}

}
