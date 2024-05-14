package interfacce;

public interface Contratto {

	//proprietà implicitamente public e final (costanti)
	double ALIQUOTA_IVA = 0.22;
	
	
	//i metodi sono solo dichiarati, non ci sono le graffe
	//metodi sono implicitamente public e abstract
	void obbligoUno();
	int obbligoDue(String parametro);
	
}
