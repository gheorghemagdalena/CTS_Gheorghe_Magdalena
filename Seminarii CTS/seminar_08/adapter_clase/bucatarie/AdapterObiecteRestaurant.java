package adapter_clase.bucatarie;

import adapter_clase.bar.ISoftBar;

public class AdapterObiecteRestaurant implements ISoftRestaurant {
	ISoftBar softbar;

	public AdapterObiecteRestaurant(ISoftBar softbar) {
		super();
		this.softbar = softbar;
	}

	@Override
	public void printeazaNota(double totalSuma) {
		this.softbar.printeazaNotaBauturi(totalSuma);

	}

}
