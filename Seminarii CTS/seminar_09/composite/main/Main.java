package composite.main;

import composite.clase.Item;
import composite.clase.Produs;
import composite.clase.Sectiune;

public class Main {

	public static void main(String[] args) throws Exception {
		Item meniu = new Sectiune("Meniu Restaurant");

//		Sectiuni
		Item sectiuneBauturi = new Sectiune("Bauturi");
		Item sectiuneStartere = new Sectiune("Startere");

//		Subsectiuni
		Item subsectiuneCafele = new Sectiune("Cafele");
		Item subsectiuneSucuri = new Sectiune("Sucuri");

//		Produse
		Item produsCafeaNeagra = new Produs("Cafea neagra");
		Item produsCocaCola = new Produs("Coca Cola");
		Item produsApaPlata = new Produs("Apa plata");
		Item produsBruschete = new Produs("Bruschete");

		subsectiuneCafele.addItem(produsCafeaNeagra);
		subsectiuneSucuri.addItem(produsCocaCola);
		sectiuneBauturi.addItem(subsectiuneCafele);
		sectiuneBauturi.addItem(subsectiuneSucuri);
		sectiuneBauturi.addItem(produsApaPlata);
		sectiuneStartere.addItem(produsBruschete);

		meniu.addItem(sectiuneBauturi);
		meniu.addItem(sectiuneStartere);

		meniu.descriere("  ");

	}

}
