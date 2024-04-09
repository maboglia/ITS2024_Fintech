package controller;

import java.util.ArrayList;

import model.Libro;

public class Biblioteca {

	/**
	 * Contenitore di oggetti di tipo Libro
	 */
	private ArrayList<Libro> libri;//deve essere inizializzata
	
	public Biblioteca() {
		this.libri = new ArrayList<Libro>();//inizializzazione
	}
	
	public void addLibro(Libro l) {
		this.libri.add(l);
	}
	
	public int contaLibri() {
		return libri.size();
	}
	
	public ArrayList<Libro> getLibri() {
		return libri;
	}
}
