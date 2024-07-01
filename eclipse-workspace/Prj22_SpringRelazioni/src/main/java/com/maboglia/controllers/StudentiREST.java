package com.maboglia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Corso;
import com.maboglia.services.StudentiService;

@RestController
@RequestMapping("api")
public class StudentiREST {

	@Autowired
	private StudentiService service;
	
	@GetMapping("corsi")
	public List<Corso> getCorsi(){
		return service.getCorsi(); 
	}
	
}
