package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.LibrettoUniversitario;

public interface LibrettoDAO extends JpaRepository<LibrettoUniversitario, Long> {

}
