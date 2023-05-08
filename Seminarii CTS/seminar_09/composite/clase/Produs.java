package composite.clase;

public class Produs implements Item {

	private String nume;

	public Produs(String nume) {
		this.nume = nume;
	}

	@Override
	public void addItem(Item item) throws Exception {
		throw new Exception("addItem nu este implementat");
	}

	@Override
	public void deleteItem(Item item) throws Exception {
		throw new Exception("deleteItem nu este implementat");
	}

	@Override
	public void descriere(String indentare) {
		System.out.println(indentare + this.nume);
	}

	@Override
	public Item getItem(int index) throws Exception {
		throw new Exception("getItem nu este implementat");
	}

}
