package decorator.clase;

public class DecoratorNotaPlataPaste extends Decorator {

	public DecoratorNotaPlataPaste(INotaPlata notaPlata) {
		super(notaPlata);
	}

	@Override
	public void printareFelicitare() {
		System.out.println("Paste fericit.");
	}

}
