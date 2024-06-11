package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Prodotto;
import com.maboglia.repos.ProdottoDAO;

@Service
public class ProdottoServiceImpl implements ProdottoService {

	@Autowired
	private ProdottoDAO dao;
	
	@Override
	public List<Prodotto> getProdotti() {
		return dao.findAll();
	}

	@Override
	public List<Prodotto> getProdottiByPrezzo(double min, double max) {
		return dao.findByPriceBetween(min, max);
	}

	@Override
	public Prodotto addProdotto(Prodotto p) {
		return dao.save(p);
	}

	@Override
	public Prodotto updateProdotto(Prodotto p) {
		return dao.save(p);
	}

	@Override
	public void deleteProdotto(Prodotto p) {
		dao.delete(p);

	}

}
