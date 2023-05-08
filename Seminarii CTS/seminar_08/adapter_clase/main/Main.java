package adapter_clase.main;

import adapter_clase.bar.ISoftBar;
import adapter_clase.bar.SoftBar;
import adapter_clase.bucatarie.AdapterObiecteRestaurant;
import adapter_clase.bucatarie.AdapterRestaurant;
import adapter_clase.bucatarie.Bucatarie;
import adapter_clase.bucatarie.ISoftRestaurant;

public class Main {
	public static void imprimare(ISoftRestaurant bucatarie, double suma) {
		bucatarie.printeazaNota(suma);
	}
	
	public static void main(String[] args) {
		ISoftBar bar = new SoftBar("Alcadibo");
		bar.printeazaNotaBauturi(240);
		
		ISoftRestaurant bucatarie = new Bucatarie("George");
		bucatarie.printeazaNota(300);
		
//		imprimare(bar, 300);
		imprimare(bucatarie, 550);
		
		AdapterRestaurant adapter = new AdapterRestaurant("Alcadibo");
		imprimare(adapter, 450);
		
//		Adapter obiecte ...
		AdapterObiecteRestaurant adapterObiecte = new AdapterObiecteRestaurant(bar);
		imprimare(adapterObiecte, 944);
		
		
	}
}
