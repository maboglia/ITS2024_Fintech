package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.LibrettoUniversitario;
import com.maboglia.entities.Pokemon;
import com.maboglia.entities.Studente;

public interface ITSService {

	List<Studente> getStudenti();
	Studente getStudenteById(int id);
	
	List<LibrettoUniversitario> getLibretti();
	LibrettoUniversitario getLibretto(int id);
	
	Studente addStudente(Studente s);
	LibrettoUniversitario addLibretto(LibrettoUniversitario lu);
	
	List<Pokemon> getPokemon();
	List<Pokemon> getPokemonByName(String name);
	
}
