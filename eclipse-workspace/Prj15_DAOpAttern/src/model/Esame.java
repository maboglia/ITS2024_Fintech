package model;

import java.time.LocalDate;

public class Esame {

	private Student studente;
	private Corso corso;
	private LocalDate data;
	private int voto;
	
	
	public Student getStudente() {
		return studente;
	}
	public void setStudente(Student studente) {
		this.studente = studente;
	}
	public Corso getCorso() {
		return corso;
	}
	public void setCorso(Corso corso) {
		this.corso = corso;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) {
		this.voto = voto;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Esame [studente=");
		builder.append(studente);
		builder.append(", corso=");
		builder.append(corso);
		builder.append(", data=");
		builder.append(data);
		builder.append(", voto=");
		builder.append(voto);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
