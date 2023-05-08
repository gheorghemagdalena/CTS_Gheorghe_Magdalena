package proxy.main;

import proxy.clase.IRestaurant;
import proxy.clase.ProxyRestaurant;
import proxy.clase.Restaurant;

public class Main {

	public static void main(String[] args) {
		IRestaurant restaurant = new Restaurant("Hush");
		restaurant.rezervaMasa(3);
		
		IRestaurant proxy = new ProxyRestaurant(restaurant);
		proxy.rezervaMasa(2);
		proxy.rezervaMasa(5);
	}

}
