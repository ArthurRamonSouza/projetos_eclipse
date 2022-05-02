package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Java Coleções", "Arthur Ramón");
		//javaColecoes.getAulas().add(new Aula("Aula 1 do curso", 15));
		javaColecoes.adiciona("Aula 2 do curso", 22);
		javaColecoes.adiciona("Modelando com coleções", 21);
		javaColecoes.adiciona("Criando uma Aula", 20);

		System.out.println(javaColecoes.getAulas());
						
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
				
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		//Collections.sort(aulas);
		aulas.sort(null);
		System.out.println(aulas);
		System.out.println(javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);
		
	}

}
