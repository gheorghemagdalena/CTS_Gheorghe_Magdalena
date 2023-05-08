package decorator.main;

import decorator.clase.Decorator;
import decorator.clase.DecoratorNotaPlata;
import decorator.clase.DecoratorNotaPlataPaste;
import decorator.clase.INotaPlata;
import decorator.clase.NotaPlata;

public class Main {

	public static void main(String[] args) {
		INotaPlata notaPlata = new NotaPlata("2023-04-25");
		INotaPlata notaPlata2 = new NotaPlata("2023-04-26");
		
		notaPlata.printeazaNota(250);
		notaPlata2.printeazaNota(400);
		System.out.println();
		
		Decorator notaPlataNastere = new DecoratorNotaPlata(notaPlata);
		notaPlataNastere.printeazaNota(250);
		Decorator notaPlataPaste = new DecoratorNotaPlataPaste(notaPlata2);
		notaPlataPaste.printeazaNota(400);
		notaPlataPaste.printareFelicitare();
		
	}

}
