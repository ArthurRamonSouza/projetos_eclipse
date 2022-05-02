package listaDuplamenteLigada;

public class TestaListas {

	public static void main(String[] args) {

		DoublyLinkedList<String> lista = new DoublyLinkedList<>();
		lista.add("1");
		lista.add("2");
		lista.add("3");
		lista.add("4");
		lista.getElements();
		lista.getElementoIndex(3);
		lista.remove("5");
		lista.getElements();
		System.out.println(lista.get(0));
		lista.set(2, "5");
		lista.getElements();

		
		lista.insert("4", 2);
		lista.getElements();
		
		lista.set(0, "e");
		lista.set(1, "c");
		lista.set(2, "b");
		lista.set(3, "d");
		lista.add("a");
		lista.sort();
		lista.getElements();

		
	}

}
