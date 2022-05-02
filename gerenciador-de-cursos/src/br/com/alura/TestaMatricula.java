package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class TestaMatricula {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Java Coleções", "Arthur Ramón");
		
		javaColecoes.adiciona("Aula 2 do curso", 22);
		javaColecoes.adiciona("Modelando com coleções", 21);
		javaColecoes.adiciona("Criando uma Aula", 20);

		Aluno a1 = new Aluno("Paulo Silveira", 56678);
		Aluno a2 = new Aluno("Nico Steppat", 33647);
		Aluno a3 = new Aluno("Guilherme Silveira", 56679);
		Aluno a4 = new Aluno("Rafaela Ballerini", 78892);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		javaColecoes.getAlunos().forEach(aluno -> {
		    System.out.println(aluno);
		});
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
				
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
		System.out.println(alunosSincronizados);
//		Set<String> nomes = Collections.emptySet();
//		nomes.add("Paulo"); //o que acontece aqui?
		
	}

}
