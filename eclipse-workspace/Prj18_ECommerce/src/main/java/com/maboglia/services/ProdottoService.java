package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Prodotto;

public interface ProdottoService {

	List<Prodotto> getProdotti();
	List<Prodotto> getProdottiByPrezzo(double min, double max);
	
	Prodotto addProdotto(Prodotto p);
	Prodotto updateProdotto(Prodotto p);
	void deleteProdotto(Prodotto p);
	
}
