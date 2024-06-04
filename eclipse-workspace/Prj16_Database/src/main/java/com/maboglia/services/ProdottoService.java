package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Prodotto;
import com.maboglia.repos.ProdottoDAO;

@Service
public class ProdottoService implements IProdottoService {

	@Autowired
	private ProdottoDAO dao;
	
	@Override
	public Prodotto addProdotto(Prodotto p) {
		return dao.save(p);
	}

	@Override
	public List<Prodotto> getProdotti() {
		return dao.findAll();
	}

	@Override
	public Prodotto getProdottoById(int id) {
		return dao.getReferenceById((long) id);
	}

	@Override
	public Prodotto updateProdotto(Prodotto p) {
		return dao.save(p);
	}

	@Override
	public void deleteProdotto(Prodotto p) {
		dao.delete(p);
	}

	@Override
	public void deleteProdotto(int id) {
		dao.deleteById((long) id);
	}

}
