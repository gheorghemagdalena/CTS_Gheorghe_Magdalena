package decorator.clase;

public class NotaPlata implements INotaPlata {
	private String dataEmiterii;

	public NotaPlata(String dataEmiterii) {
		this.dataEmiterii = dataEmiterii;
	}

	@Override
	public void printeazaNota(double totalPlata) {
		System.out.println(
				"Nota dvs. de plata din data de " + dataEmiterii + " este in valoare de " + totalPlata + " lei.");
	}

}
