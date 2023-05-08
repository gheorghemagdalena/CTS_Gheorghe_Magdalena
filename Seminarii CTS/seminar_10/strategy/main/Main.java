package strategy.main;

import strategy.clase.Client;
import strategy.clase.PlataCard;
import strategy.clase.PlataCash;

public class Main {

	public static void main(String[] args) {
		Client client = new Client("Ana");
		client.realizeazaPlata(2000.0);
		
		client.setModPlata(new PlataCard());
		client.realizeazaPlata(1550.0);
		
		client.setModPlata(new PlataCash());
		client.realizeazaPlata(300.0);
	}

}
