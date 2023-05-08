package decorator.clase;

public abstract class Decorator implements INotaPlata {

	private INotaPlata notaPlata;

	public Decorator(INotaPlata notaPlata) {
		super();
		this.notaPlata = notaPlata;
	}

	@Override
	public void printeazaNota(double totalPlata) {
		this.notaPlata.printeazaNota(totalPlata);
	}

	public abstract void printareFelicitare();

}
