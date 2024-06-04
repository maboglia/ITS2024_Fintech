package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Film;
import com.maboglia.repos.FilmDAO;

@Service
public class FilmServiceImpl implements FilmService {
	
	@Autowired
	private FilmDAO dao;

	@Override
	public List<Film> getFilms() {
		
		return dao.findAll();
	}

	@Override
	public Film getFilmById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Film addFilm(Film f) {
		// TODO Auto-generated method stub
		return dao.save(f);
	}

}
