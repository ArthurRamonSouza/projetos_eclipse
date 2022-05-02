package listaLigada;

public class TestaLista {

	public static void main(String[] args) {
		
		LinkedList<String> lista2 = new LinkedList<>();
		
		lista2.insert("arroz", 0);
		lista2.add("agua");
		lista2.add("teto");
		lista2.add("goiaba");
		lista2.add("goiabada");
		lista2.add("dinheiro");
		lista2.add("feijao");

		
		System.out.println("Elementos: " + lista2.getSize());
		//lista2.remove(1);
		//lista2.remove("Segundo elemento");
		lista2.getElements();
		System.out.println("");
		
		//lista2.insert("Elemento infiltrado", 2);
		System.out.println("Elementos: " + lista2.getSize());
		System.out.println("");
		lista2.getElements();
		
		//lista2.set(2, "Novo elemento");
		System.out.println("");
		lista2.getElements();
		lista2.sort();
		System.out.println("");
		System.out.println("é agr -->");
		lista2.getElements();
		
		Queue<String> fila = new Queue<>();
		fila.add("Primeiro elemento");
		fila.add("Segundo elemento");
		fila.add("Terceiro elemento");
		fila.add("Quarto elemento");
		System.out.println("");
		fila.getElements();
		
		fila.remove();
		System.out.println("");
		fila.getElements();
		fila.remove();
		
		Stack<String> pilha = new Stack<>();
		
		pilha.pop("Primeiro Elemento");
		pilha.pop("Segundo Elemento");
		pilha.pop("Terceiro Elemento");
		pilha.pop("Quarto Elemento");
		
		System.out.println("");
		System.out.println("pilha");
		System.out.println(pilha.getSize());
		pilha.getElements();
		
		pilha.push();
		System.out.println("");
		System.out.println("pilha");
		pilha.getElements();
		
	}
}
