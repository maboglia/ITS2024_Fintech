package model;

import java.time.LocalDate;

public class Todo {

	//proprietà della classe Todo
	private static int contatore = 1;
	//proprietà dell'oggetto
	private int id;
	private String descrizione;
	private LocalDate data;
	private boolean completo;
	
	public Todo(String descrizione) {
		this.descrizione = descrizione;
		this.completo = false;
		this.data = LocalDate.now();
		this.id = contatore++;
	}

	public static int getContatore() {
		return contatore;
	}

	public static void setContatore(int contatore) {
		Todo.contatore = contatore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public boolean isCompleto() {
		return completo;
	}

	public void setCompleto(boolean completo) {
		this.completo = completo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Todo [id=");
		builder.append(id);
		builder.append(", descrizione=");
		builder.append(descrizione);
		builder.append(", data=");
		builder.append(data);
		builder.append(", completo=");
		builder.append(completo);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
