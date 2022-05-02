package listaLigada;

public class LinkedList<Type> {
	private Node<Type> head;
	private Node<Type> tail;
	private int size = 0;

	public Node<Type> getHead() {
		return this.head;
	}
	public void setHead(Node<Type> node) {
		this.head = node;
		
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void setSize(int i) {
		this.size = i;
		
	}
	
	public Node<Type> getTail() {
		return this.tail;
	}
	
	public void setTail(Node<Type> node) {
		this.tail = node;
	}
	
	public void insert(Type object, int idx) {
		Node<Type> nodeNovo = new Node<>();
		nodeNovo.value = object;
		
		if(this.size == 0 && idx == 0) {
			this.head = nodeNovo;
			this.tail = nodeNovo;
			this.size++;
			
		}else {
			if(this.validaIndex(idx) == true) {
				Node<Type> nodeAnterior = this.head;
				Node<Type> nodeDoIndice = this.head.next;
				int contador = 1;
				
				if(idx == 0) {
					nodeNovo.next = nodeAnterior;
					this.head = nodeNovo;
					
				}else {
					while(contador < idx) {
						nodeAnterior = nodeDoIndice;
						nodeDoIndice = nodeDoIndice.next;
						contador++;
					}
					nodeAnterior.next = nodeNovo;
					nodeNovo.next = nodeDoIndice;
					
					if(idx+1 == this.size) {
						this.tail = nodeDoIndice;
					}
				}this.size++;
			}
		}
	}
	
	public void add(Type object) {
		Node<Type> node = new Node<>();
		node.value = object;
		
		if(this.head == null) {
			this.head = node;
			this.tail = node;

		}else {
			this.tail.next = node;
			this.tail = node;

		}
		this.size++;
	}
	
	public Type get(int idx) {
		
		if(this.validaIndex(idx) == true) {
			int contador = 0;
			Node<Type> node = this.head;
					
			while(contador < idx) {
				node = node.next;
				contador++;
			}
			return node.value;
		} return null;
	}


	public void remove(int idx) {
		
		if(this.validaIndex(idx) == true) {
			if(idx == 0) {
				this.head = this.head.next;
			}
			
			else {
				Node<Type> nodeAnterior = head;
				Node<Type> nodeRemover = head.next;
				int contador = 1;
				
				while(contador < idx) {
					nodeAnterior = nodeRemover;
					nodeRemover = nodeRemover.next;
					contador++;
				}
				nodeAnterior.next = nodeRemover.next;
				
				if(idx+1 == this.size) {
					this.tail = nodeAnterior;
				}
			}
			this.size--;
		}
	}


	public void remove(Type value) {
		Node<Type> nodeAnterior = this.head;
		Node<Type> nodeRemover = this.head.next;
		
		if(value.equals(this.head.value)) {
			this.head = this.head.next;
			
		}else {
			
			while(nodeRemover != null && value != nodeRemover.value) {
				nodeAnterior = nodeRemover;
				nodeRemover = nodeRemover.next;
			}
			if(nodeRemover == tail) {
				tail = nodeAnterior;
			}
			if(nodeRemover != null) {
				nodeAnterior.next = nodeRemover.next;
			}else {
				throw new ParametroInvalidoException();
			}
		}
		this.size--;
	}

	public void set(int idx, Type value) {
		Node<Type> node = this.head;
		
		if(this.validaIndex(idx) == true) {
			if(this.size > 0) {
				int contador = 0;
				while(contador < idx) {
					node = node.next;
					contador++;
				}
				node.value = value;
			}
		} return;	
	}

	public boolean validaIndex(int index) {
		
		if(index+1 > this.size || index < 0) {
			throw new ParametroInvalidoException();
		}
		return true;
	}
	
	public void getElements() {
		for(int i = 0; i < this.size; i++) {
			System.out.println(this.get(i));
		}
	}
	
	public void sort(){
		Node<Type> nodeRef = this.head;
		Node<Type> nodeAtual = nodeRef.next;
		
		while(nodeRef != null) {
			nodeAtual = nodeRef.next;
			
			while(nodeAtual != null) {
				if(((String)nodeRef.value).compareTo((String)nodeAtual.value) > 0) {
					Type valueRef = nodeRef.value;
					nodeRef.value = nodeAtual.value;
					nodeAtual.value = valueRef;
				}
				nodeAtual = nodeAtual.next;
			}
			nodeRef = nodeRef.next;
		} 
	}
}
		
class Node<Type> {
	Type value;
	Node<Type> next;
	
}

class ParametroInvalidoException extends RuntimeException {
	
}