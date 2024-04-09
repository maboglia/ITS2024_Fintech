package controller;

import java.util.ArrayList;

import model.*;
import view.DipendentiWeb;

public class Azienda {

	private String nome;
	private ArrayList<Dipendente> dipendenti;
	
	public Azienda(String nome) {
		this.nome = nome;
		this.dipendenti = new ArrayList<>();
	}
	
	public Dipendente getDipendenteById(int id) {
		for (Dipendente d : dipendenti) {
			if (d.getnMatricola() == id) {
				return d;
			}
		}
		
		return null;
	}
	
	public void addDipendente(Dipendente d) {
		this.dipendenti.add(d);
	}
	
	public void addDipendente(String nome, String cognome, String ruolo) {
		Dipendente d = null;
		switch (ruolo) {
		case "Impiegato":
			d = new Impiegato(nome, cognome);
			break;
		case "Fattorino":
			d = new Fattorino(nome, cognome);
			break;
		case "Dirigente":
			d = new Dirigente(nome, cognome);
			break;
		case "Direttore":
			d = new Direttore(nome, cognome);
			break;			
		default:
			break;
		}
		
		this.dipendenti.add(d);
	}
	
	public ArrayList<Dipendente> getDipendenti() {
		return dipendenti;
	}
	
	public ArrayList<Dipendente> getImpiegati(){
		ArrayList<Dipendente> impiegati = new ArrayList<>();//costruisco un array di dipendenti vuoto
		for (Dipendente dipendente : dipendenti) {//scorro tutti i dipendenti
			if (dipendente instanceof Impiegato) {//se il dip corrente è un impiegato
				impiegati.add(dipendente);//allora lo aggiungo all'array di impiegati
			}
		}
		return impiegati;
	}
	
	public void calcolaStipendi() {
		for (Dipendente dipendente : dipendenti) {
			dipendente.calcolaStipendio();
		}
	}
	
	public String listaStipendi() {
		
		DipendentiWeb webPage = new DipendentiWeb();
		
		return webPage.creaLista(dipendenti);
		
	}
	
}
