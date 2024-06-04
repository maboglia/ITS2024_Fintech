package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maboglia.entities.Film;

@Repository
public interface FilmDAO extends JpaRepository<Film, Integer> {

}
