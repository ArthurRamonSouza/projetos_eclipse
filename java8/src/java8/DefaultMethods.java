package java8;

import java.util.ArrayList;
import java.util.Comparator;
import static java.util.Comparator.comparing; // ou import static java.util.Comparator.*;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethods {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		//Consumer<String> consumidor = new Consumidor();	
		palavras.forEach(System.out::println);

		// Comparator<String> comparador = new Comparador();
		//palavras.sort((s1, s2) -> s1.length() - s2.length());
		palavras.sort(comparing( String ::length));
		palavras.sort(String.CASE_INSENSITIVE_ORDER);

		System.out.println(palavras);
	
		new Thread(() -> System.out.println("Executando um Runnable")).start();
		/*
		 * new Thread(new Runnable() {
		 * 
		 * @Override public void run() { System.out.println("Executando um Runnable"); }
		 * 
		 * }).start();
		 */
	}
}

/*
 * class Consumidor implements Consumer<String> {
 * 
 * @Override public void accept(String s) { System.out.println(s); }
 * 
 * }
 */

/*
 * class Comparador implements Comparator<String> {
 * 
 * @Override public int compare(String s1, String s2) { return s1.length() -
 * s2.length(); }
 * 
 * }
 */