package facade.main;

import facade.clase.Restaurant;

public class Main {
	public static void main(String[] args) {
		Restaurant facade = new Restaurant();
		System.out.println(facade.verificareDisponibilitateMasa(1));
		System.out.println(facade.verificareDisponibilitateMasa(2));
		System.out.println(facade.verificareDisponibilitateMasa(3));
	}
}
