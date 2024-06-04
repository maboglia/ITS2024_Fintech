package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Prodotto;

public interface IProdottoService {
	//create
	Prodotto addProdotto(Prodotto p);

	//read retrieve
	List<Prodotto> getProdotti();
	Prodotto getProdottoById(int id);
	
	//update
	Prodotto updateProdotto(Prodotto p);
	
	//delete
	void deleteProdotto(Prodotto p);
	void deleteProdotto(int id);
}
