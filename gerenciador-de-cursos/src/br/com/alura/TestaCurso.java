package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Java Coleções", "Arthur Ramón");
		//javaColecoes.getAulas().add(new Aula("Aula 1 do curso", 15));
		javaColecoes.adiciona("Aula 2 do curso", 22);
		javaColecoes.adiciona("Criando uma Aula", 20);
		 System.out.println(javaColecoes.getAulas());
		
		
	}

}
