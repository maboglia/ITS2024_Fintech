package com.maboglia.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.Pokemon;

public interface PokemonDAO extends JpaRepository<Pokemon, String>{

	List<Pokemon> findByNameContaining(String name);
	
}
