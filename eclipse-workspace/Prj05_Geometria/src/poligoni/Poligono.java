package poligoni;

public abstract class Poligono {//non si possono costruire oggetti di tipo Poligono

	String nome;
	int numeroLati;
	int numeroAngoli;
	double perimetro;
	double area;
	
	
	
	public Poligono(String nome, int numeroLati, int numeroAngoli) {
		this.nome = nome;
		this.numeroLati = numeroLati;
		this.numeroAngoli = numeroAngoli;

		
	}

	public abstract double perimetro();//PPC - DBC Design by contract
	public abstract double area();
	
	
	
	@Override
	public String toString() {
		return "Poligono [nome=" + nome + ", numeroLati=" + numeroLati + ", numeroAngoli=" + numeroAngoli
				+ ", perimetro=" + perimetro + ", area=" + area + "]";
	}
	
	
	
	
	
}
