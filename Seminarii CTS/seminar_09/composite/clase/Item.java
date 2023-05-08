package composite.clase;

public interface Item {
	void addItem(Item item) throws Exception;

	void deleteItem(Item item) throws Exception;

	void descriere(String indentare);

	Item getItem(int index) throws Exception;
}
