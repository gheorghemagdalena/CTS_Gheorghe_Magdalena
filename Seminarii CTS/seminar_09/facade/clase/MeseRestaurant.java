package facade.clase;

import java.util.HashMap;
import java.util.Map;

public class MeseRestaurant {
	private Map<Integer, Masa> listaMese;

	public MeseRestaurant() {
		this.listaMese = new HashMap<>();
	}
	
	public void adaugaMasa(Masa masa) {
		listaMese.put(masa.getNrMasa(), masa);
	}
	
	public Boolean esteLibera(int nrMasa) {
		return listaMese.get(nrMasa).getMasaLibera();
	}
	
	public Boolean suntServetele(int nrMasa) {
		return listaMese.get(nrMasa).getAreServetele();
	}

}
