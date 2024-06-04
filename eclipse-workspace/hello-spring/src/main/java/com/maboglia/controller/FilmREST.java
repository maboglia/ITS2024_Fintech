package com.maboglia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Film;
import com.maboglia.services.FilmService;

//rest controller a default parla in formato json
@RestController
public class FilmREST {

	@Autowired
	private FilmService service;

	@GetMapping("api/film")
	public List<Film> getAll(){
		return service.getFilms();
	}
	
	@PostMapping("api/film")
	public Film addFilm(@RequestBody  Film f) {
		return service.addFilm(f);
	}


}
