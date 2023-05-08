package facade.clase;

public class Restaurant {
	private MeseRestaurant meseRestaurant;
	private Ospatar ospatar;

	public Restaurant() {
		ospatar = new Ospatar();
		meseRestaurant = new MeseRestaurant();
		meseRestaurant.adaugaMasa(new Masa(true, true, 1));
		meseRestaurant.adaugaMasa(new Masa(false, true, 2));
		meseRestaurant.adaugaMasa(new Masa(true, false, 3));
		ospatar.debaraseazaMasa(1);
		ospatar.debaraseazaMasa(2);

	}

	public String verificareDisponibilitateMasa(int nrMasa) {
		if (meseRestaurant.esteLibera(nrMasa)) {
			if (ospatar.esteMasaDebarasata(nrMasa) && meseRestaurant.suntServetele(nrMasa)) {
				return "Masa este libera si puteti lua loc.";
			} else {
				return "Masa este libera, asteptati sa fie debarasata.";
			}
		} else {
			return "Masa nu este disponibila momentan.";
		}
	}
}
