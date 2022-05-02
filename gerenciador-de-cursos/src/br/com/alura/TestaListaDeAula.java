package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("Lista de objetos", 20);
		Aula a2 = new Aula("Revistando as ArrayLists", 21);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aula> curso = new ArrayList<>();
		curso.add(a3);
		curso.add(a2);
		curso.add(a1);
		System.out.println(curso);
		
		Collections.sort(curso);
		System.out.println(curso);
		
		curso.sort(Comparator.comparing(Aula::getTempo));
		System.out.println(curso);
				
	}

}
