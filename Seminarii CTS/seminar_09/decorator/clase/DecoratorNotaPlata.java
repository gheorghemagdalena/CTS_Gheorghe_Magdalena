package decorator.clase;

public class DecoratorNotaPlata extends Decorator {

	public DecoratorNotaPlata(INotaPlata notaPlata) {
		super(notaPlata);

	}

	@Override
	public void printeazaNota(double totalPlata) {
		super.printeazaNota(totalPlata);
		System.out.println("La multi ani.");

	}

	@Override
	public void printareFelicitare() {
		System.out.println("La multi ani.");
	}

}
