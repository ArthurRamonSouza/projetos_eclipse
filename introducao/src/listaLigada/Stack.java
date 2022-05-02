package listaLigada;
import listaLigada.LinkedList;

public class Stack<Type> extends LinkedList<Type> {
	
	
	public void pop(Type object) {
		Node<Type> nodeTail = super.getTail();
		Node<Type> node = new Node<>();
		node.value = object;
		
		if(super.getTail() == null) {
			super.setHead(node);
			super.setTail(node);
		}else {
			nodeTail.next = node;
			super.setTail(node);
		}
		int size = super.getSize();
		super.setSize(size = size+1);
	}
	
	public void push() {
		Node<Type> node = super.getTail();
		
		if(super.getTail() == null) {
			throw new ParametroInvalidoException();
		}else {
			Node<Type> nodeAnterior = super.getHead();
			int contador = 0;
			while(contador < super.getSize()-1) {
				nodeAnterior = nodeAnterior.next;
				contador++;				
			} 
			nodeAnterior.next = null;
			int size = super.getSize();
			super.setSize(size = size -1);
			
		}
		
	}

}
