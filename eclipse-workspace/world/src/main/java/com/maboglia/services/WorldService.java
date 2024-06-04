package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.City;
import com.maboglia.entities.Country;

public interface WorldService {

	List<Country> getCountries();
	List<City> getCities();
	
	Country getCountryByCode(String code);
	City getCityBYId(int id);
	
	
}
