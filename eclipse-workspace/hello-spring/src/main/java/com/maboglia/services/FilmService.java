package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Film;

public interface FilmService {

	List<Film> getFilms();
	Film getFilmById(int id);
	
	Film addFilm(Film f);
	
}
