package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.Libretto;

public interface LibrettoDAO extends JpaRepository<Libretto, Long> {

}
