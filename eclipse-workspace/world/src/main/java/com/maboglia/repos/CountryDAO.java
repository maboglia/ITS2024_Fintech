package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.Country;

public interface CountryDAO extends JpaRepository<Country, String> {

}
