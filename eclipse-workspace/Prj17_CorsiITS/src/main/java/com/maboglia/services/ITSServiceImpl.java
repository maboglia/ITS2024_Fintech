package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.LibrettoUniversitario;
import com.maboglia.entities.Pokemon;
import com.maboglia.entities.Studente;
import com.maboglia.repos.LibrettoDAO;
import com.maboglia.repos.PokemonDAO;
import com.maboglia.repos.StudenteDAO;

@Service
public class ITSServiceImpl implements ITSService {

	@Autowired
	private StudenteDAO studenteDAO;
	@Autowired
	private LibrettoDAO librettoDAO;
	@Autowired
	private PokemonDAO pokDAO;
	
	@Override
	public List<Studente> getStudenti() {
		return studenteDAO.findAll();
	}

	@Override
	public Studente getStudenteById(int id) {
		
		return studenteDAO.getReferenceById((long) id);
	}

	@Override
	public List<LibrettoUniversitario> getLibretti() {
		return librettoDAO.findAll();
	}

	@Override
	public LibrettoUniversitario getLibretto(int id) {
		return librettoDAO.getReferenceById((long) id);
	}

	@Override
	public Studente addStudente(Studente s) {
		return studenteDAO.save(s);
	}

	@Override
	public LibrettoUniversitario addLibretto(LibrettoUniversitario lu) {
		return librettoDAO.save(lu);
	}

	@Override
	public List<Pokemon> getPokemon() {
		// TODO Auto-generated method stub
		return pokDAO.findAll();
	}

	@Override
	public List<Pokemon> getPokemonByName(String name) {
		// TODO Auto-generated method stub
		return pokDAO.findByNameContaining(name);
	}

}
