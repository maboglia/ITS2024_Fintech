package testing;

import model.*;
import services.CapiService;


public class TestService {

	private CapiService service = new CapiService();
	
	
	public void testNuovoCapo() {
		
		service.addCapo(new Maglia());
		
		int quantiCapi = service.getCapi().size();
		
	
		
	}
	
	
	
	
}
