package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.City;

public interface CityDAO extends JpaRepository<City, Integer> {

}
