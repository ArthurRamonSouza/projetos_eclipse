package listaLigada;

import listaLigada.LinkedList;

public class Queue<Type> {
	private LinkedList<Type> lista = new LinkedList<>();
	
	public void remove() {
		lista.remove(0);
	}
	
	public void add(Type object) {
		lista.add(object);
	}

	public void getElements() {
		lista.getElements();
	}
	
	
}
