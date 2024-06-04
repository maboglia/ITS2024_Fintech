package com.maboglia.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Studente {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(mappedBy = "studente", cascade = CascadeType.ALL)
    private LibrettoUniversitario librettoUniversitario;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "iscrizioni",
            joinColumns = { @JoinColumn(name = "studente_id") },
            inverseJoinColumns = { @JoinColumn(name = "corso_id") }
    )
    private Set<Corso> corsi = new HashSet<>();
    
    
    
	public Set<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(Set<Corso> corsi) {
		this.corsi = corsi;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LibrettoUniversitario getLibrettoUniversitario() {
		return librettoUniversitario;
	}

	public void setLibrettoUniversitario(LibrettoUniversitario librettoUniversitario) {
		this.librettoUniversitario = librettoUniversitario;
	}

    
}
