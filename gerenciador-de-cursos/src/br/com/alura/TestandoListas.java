package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String curso1 = "Java Collections: Dominando Listas, Sets e Mapas"; 
		String curso2 = "Java moderno: Tire proveito dos novos recursos do Java 8";
		String curso3 = "TDD e Java: Testes automatizados com JUnit";
		String curso4 = "Java.io: Inputs e Outputs";
		
		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		
		System.out.println("O curso será removido da lista: " + cursos.get(3));
		cursos.remove(3);
		System.out.println(cursos);
		
		for (String curso : cursos) {
			System.out.println("Ainda falta concluir este curso-> " + curso);	
			
		}
		
		Collections.sort(cursos);
		System.out.println("Cursos restantates ORDENADOS LEXICOGRAFICAMENTE: ");
		
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println(cursos.get(i) + ";") ;
		}
		
	}

}
