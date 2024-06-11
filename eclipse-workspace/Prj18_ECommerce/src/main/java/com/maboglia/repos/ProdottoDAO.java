package com.maboglia.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.Prodotto;

public interface ProdottoDAO extends JpaRepository<Prodotto, Integer> {

	//derived query
	List<Prodotto> findByPriceBetween(double min, double max);
	
}
