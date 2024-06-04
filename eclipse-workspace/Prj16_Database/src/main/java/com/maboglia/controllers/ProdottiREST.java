package com.maboglia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Prodotto;
import com.maboglia.services.ProdottoService;

@RestController
@RequestMapping(path = {"","api"})
public class ProdottiREST {

	@Autowired
	private ProdottoService service;
	
	@GetMapping("prodotti")
	public List<Prodotto> getProdotti(){
		return service.getProdotti();
	}
	
	@GetMapping("prodotti/{id}")
	public Prodotto getProdotto(@PathVariable int id ){
		return service.getProdottoById(id);
	}
	
	@PostMapping("prodotti")
	public Prodotto addProdotto(@RequestBody Prodotto p) {
		return service.addProdotto(p);
	}
	
	@PostMapping("molti/prodotti")
	public List<Prodotto> addProdotti(@RequestBody List<Prodotto> p) {
		
		for (Prodotto prodotto : p) {
			service.addProdotto(prodotto);
		}
		
		return service.getProdotti();
	}
	
	@PutMapping("prodotti")
	public Prodotto updateProdotto(@RequestBody Prodotto p) {
		return service.updateProdotto(p);
	}
		
	@DeleteMapping("prodotti")
	public ResponseEntity<String> deleteProdotto(@RequestBody Prodotto p) {
		service.deleteProdotto(p);
		
		return new ResponseEntity<>("Eliminato", HttpStatus.I_AM_A_TEAPOT);	
	}
	
}
