package repos;

import java.util.Map;
import java.util.TreeMap;

import model.CapoAbbigliamento;
import model.Maglia;

public class CapiDAO {
	//            SET        COLLECTION
	private Map<Integer, CapoAbbigliamento> capiMap = new TreeMap<>();

	{//blocco di inizializzazione
		System.out.println("Sono nel blocco di init di capiDAO");
		Maglia m1 = new Maglia();
		capiMap.put(m1.getCodProdotto(), m1);
	}
	
	public CapiDAO() {
		System.out.println("Sono nel costruttore di capiDAO");
	}

	public Map<Integer, CapoAbbigliamento> getCapiMap() {
		return capiMap;
	}
	
	
}
