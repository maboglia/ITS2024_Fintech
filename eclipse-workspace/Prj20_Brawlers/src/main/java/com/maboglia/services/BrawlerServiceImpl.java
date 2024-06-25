package com.maboglia.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Brawler;
import com.maboglia.repos.BrawlerDAO;

@Service
public class BrawlerServiceImpl implements BrawlerService {

	@Autowired
	private BrawlerDAO dao;
	
	
	@Override
	public List<Brawler> getAllBrawlers() {
		return dao.findAll();
	}

	@Override
	public List<Brawler> getAllBrawlersByRarity(String rarity) {
		return dao.findByRarity(rarity);
	}

	@Override
	public List<Brawler> getAllBrawlersByCarattere(String carattere) {
		return dao.findByCarattere(carattere);
	}

	@Override
	public Brawler getBrawlersById(int id) {
		  Optional<Brawler> byId = dao.findById(id);
		  if (byId.isPresent())
			  return byId.get();
		return null;
	}

	@Override
	public Set<String> getRarities() {
		return new TreeSet<String>(	
				dao
				.findAll()
				.stream()
				.map(b -> b.getRarity())
				.distinct()
				.sorted()
				.toList()
				);
	}

	@Override
	public List<String> getCaratteri() {

		return dao
				.findAll()
				.stream()
				.map(b -> b.getCarattere())
				.distinct()
				.sorted()
				.toList();
	}

}
