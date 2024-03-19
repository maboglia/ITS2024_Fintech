package its;
/*
 * La classe Impiegato ha

attributi di tipo string: nome, cognome, id;
attributi di tipo int: anno di nascita e stipendio;
i relativi metodi getter e setter di tutti. Il setter dell'attributo id però non prende in input il valore ma lo ottiene con il metodo creaID della classe Segreteria.
 */
	
	//---------------------------------

public class Impiegato {
	
	//---------------------------------
	private String id;
	private String nome;
	private String cognome;
	private int annoNascita;
	private int stipendio;
	//---------------------------------
	//metodo costruttore dell'oggetto
	public Impiegato(String nome, String cognome, int annoNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.annoNascita = annoNascita;
		String id = Segreteria.creaId(nome, cognome, annoNascita);
		setId(id);
		
	}
	
	
	//metodi getters setters
	public String getId() {
		return id;
	}
	
	private void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getAnnoNascita() {
		return annoNascita;
	}
	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}
	public int getStipendio() {
		return stipendio;
	}
	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}


	@Override
	public String toString() {
		return "Impiegato [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", annoNascita=" + annoNascita
				+ ", stipendio=" + stipendio + "]";
	}
	
	
	

}
