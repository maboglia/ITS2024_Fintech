package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.City;
import com.maboglia.entities.Country;
import com.maboglia.repos.CityDAO;
import com.maboglia.repos.CountryDAO;

@Service
public class WorldServiceImpl implements WorldService {

	@Autowired
	private CountryDAO countryDAO;
	
	@Autowired
	private CityDAO cityDAO;
	
	@Override
	public List<Country> getCountries() {
		return countryDAO.findAll();
	}

	@Override
	public List<City> getCities() {
		return cityDAO.findAll();
	}

	@Override
	public Country getCountryByCode(String code) {
		return countryDAO.getReferenceById(code);
	}

	@Override
	public City getCityBYId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
