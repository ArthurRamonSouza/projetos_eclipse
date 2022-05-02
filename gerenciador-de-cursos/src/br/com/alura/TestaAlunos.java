package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaAlunos {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Arthur Ramón", 55678);
		Aluno a2 = new Aluno("Rfaela Ballerini", 34456);
		Aluno a3 = new Aluno("Paulo Silveira", 86622);
		Aluno a4 = new Aluno("Nico Sttepat", 34345);
		Aluno a5 = new Aluno("Jõao Paulo", 33321);
		Aluno arthur = new Aluno("Arthur Ramón", 55678);
		
		Curso javaColecoes = new Curso("Java Coleções", "Professor Arthur");
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println(javaColecoes.estaMatriculado(a1));
				
		System.out.println(a1.equals(arthur));
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();

		while (iterador.hasNext()) {
		    System.out.println(iterador.next());
		}
		
	}

}
