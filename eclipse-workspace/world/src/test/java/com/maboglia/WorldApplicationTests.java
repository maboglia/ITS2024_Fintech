package com.maboglia;

import java.util.List;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.maboglia.entities.City;
import com.maboglia.entities.Country;
import com.maboglia.services.WorldService;

@SpringBootTest
class WorldApplicationTests {

	@Autowired
	private WorldService service;
	
	@Test
	@Order(1)
	void getCountries() {
		List<Country> countries = service.getCountries();
		System.out.println("I paesi sono " + countries.size());
	}
	
	@Test
	void getCities() {
		List<City> cities = service.getCities();
		System.out.println("Le città sono " + cities.size());
	}

}
