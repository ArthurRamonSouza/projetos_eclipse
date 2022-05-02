package listaDuplamenteLigada;

public class DoublyLinkedList<T> {
	private Node<T> head;
	private int size = 0;

	public Node<T> getUltimoElemento() {
		Node<T> node = this.head;
		while (node.next != null) {
			node = node.next;
		}
		return node;
	}

	/**
	 * Busca elemento de acordo com o índice repassado no parâmetro.
	 * @param idx indice
	 * @return Retorna elemento do indice.
	 */
	public Node<T> getElementoIndex(int idx) {
		this.validaIndex(idx);
		
		Node<T> node = this.head;
		int contador = 1;
		while (contador <= idx) {
			node = node.next;
			contador++;
		}
		return node;
	}

	public void add(T value) {
		Node<T> nodeNovo = new Node<>();
		nodeNovo.value = value;

		if (this.head == null) {
			this.head = nodeNovo;
		} else {
			Node<T> nodeUltimo = this.getUltimoElemento();
			nodeUltimo.next = nodeNovo;
			nodeNovo.prev = nodeUltimo;
		}
		this.size++;
	}

	public void remove(int idx) {
		if (idx == 0) {
			Node<T> node = this.head;
			node.next.prev = null;
			this.head = node;
		} else if (idx == size - 1) {
			Node<T> node = this.getUltimoElemento();
			node.prev.next = null;

		} else {
			Node<T> nodeRemover = this.getElementoIndex(idx);
			nodeRemover.next = nodeRemover.next.next;
			nodeRemover.next.prev = nodeRemover.prev;
		}
		this.size--;
	}

	public void remove(T value) {
		Node<T> node = this.head;
		int idx = 1;

		if (value == this.head.value) {
			idx = 0;
		} else {
			while (node != null && node.value != value) {
				node = node.next;
				idx++;
			}
		}
		if(node == null) {
			throw new RuntimeException(ParametroInvalidoException.MESSAGE);
		}
		this.remove(idx);
	}

	public T get(int idx) {

		this.validaIndex(idx);

		if (idx == 0) {
			return this.head.value;

		} else {
			Node<T> node = this.getElementoIndex(idx);
			return node.value;
		}
	}

	public void set(int idx, T value) {
		if (idx == 0) {
			this.head.value = value;
		} else if (idx == 0 && head == null) {
			this.head = new Node<>();
			this.head.value = value;
		} else if (idx == size - 1) {
			Node<T> node = this.getUltimoElemento();
			node.value = value;
		} else {
			Node<T> node = this.getElementoIndex(idx);
			node.value = value;
		}
	}

	public void sort() {
		Node<T> nodePonteiro = this.head;
		Node<T> nodeAtual;

		while (nodePonteiro != null) {
			nodeAtual = nodePonteiro.next;
			while (nodeAtual != null) {
				String value = (String) nodePonteiro.value;
				int resultado = value.compareTo((String) nodeAtual.value);
				if (resultado > 0) {
					T valueAuxiliar = nodePonteiro.value;
					nodePonteiro.value = nodeAtual.value;
					nodeAtual.value = valueAuxiliar;
				}
				nodeAtual = nodeAtual.next;
			}
			nodePonteiro = nodePonteiro.next;
		}
	}

	public void insert(T object, int idx) {
		Node<T> nodeNovo = new Node<>();
		nodeNovo.value = object;

		if (idx == 0) {
			nodeNovo.next = this.head;
			this.head.prev = nodeNovo;
			this.head = nodeNovo;
		} else if (idx == 0 && this.head == null) {
			this.add(object);
		} else {
			Node<T> node = this.getElementoIndex(idx);
			nodeNovo.next = node.next;
			node.next = nodeNovo;
			nodeNovo.prev = node;
			nodeNovo.next.prev = nodeNovo;
		} this.size++;
	}

	public void validaIndex(int idx) {
		if (idx  > this.size-1 || idx < 0) {
			throw new ParametroInvalidoException();
		}
	}

	public void getElements() {
		Node<T> node = this.head;

		System.out.println("-----------");
		for (int i = 0; i < this.size; i++) {
			System.out.println("Nó valor: " + node.value);
			System.out.println("prev: " + (node.prev == null ? null : node.prev.value));
			System.out.println("next: " + (node.next == null ? null : node.next.value));
			System.out.println("");
			node = node.next;
			System.out.println();
		}
		System.out.println("-----------");
		return;
	}

	public void clear() {
		this.head = null;
	}
}

class Node<T> {
	Node<T> prev;
	Node<T> next;
	T value;
}

class ParametroInvalidoException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	static final String MESSAGE = "Valor inválido!";
}