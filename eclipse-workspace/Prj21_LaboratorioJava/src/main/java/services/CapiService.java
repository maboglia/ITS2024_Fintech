package services;

import java.util.Collection;
import java.util.List;

import model.CapoAbbigliamento;
import repos.CapiDAO;

public class CapiService {

	private CapiDAO dao = new CapiDAO();
	
	public void addCapo(CapoAbbigliamento c) {
		dao.getCapiMap().put(c.getCodProdotto(), c);
	}

	public CapoAbbigliamento getCapo(int codProdotto) {
		return dao.getCapiMap().get(codProdotto);
	}
	
	public Collection<CapoAbbigliamento> getCapi(){
		return dao.getCapiMap().values();
	}
	
}
