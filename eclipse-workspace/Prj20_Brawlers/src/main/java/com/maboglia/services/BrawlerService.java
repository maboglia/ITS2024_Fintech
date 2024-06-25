package com.maboglia.services;

import java.util.List;
import java.util.Set;

import com.maboglia.entities.Brawler;

public interface BrawlerService {

	List<Brawler> getAllBrawlers();
	List<Brawler> getAllBrawlersByRarity(String rarity);
	List<Brawler> getAllBrawlersByCarattere(String carattere);
	Brawler getBrawlersById(int id);
	
	Set<String> getRarities();
	List<String> getCaratteri();
}
