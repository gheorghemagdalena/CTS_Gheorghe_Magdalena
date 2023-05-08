package adapter_clase.bucatarie;

import adapter_clase.bar.SoftBar;

public class AdapterRestaurant extends SoftBar implements ISoftRestaurant{

	public AdapterRestaurant(String denumire) {
		super(denumire);
	}

	@Override
	public void printeazaNota(double totalSuma) {
		super.printeazaNotaBauturi(totalSuma);
	}

}
