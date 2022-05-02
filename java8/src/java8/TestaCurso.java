package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.print.attribute.standard.Media;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
}

class TestaCurso {
	
	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		Stream<String> nomeCursos = cursos.stream().filter(c -> c.getAlunos() > 50)
				.map(Curso::getNome); //		forEach(Curso::getNome);
		
		cursos.stream().filter(c -> c.getAlunos() >= 100)
			.findAny()
			.ifPresent(c -> System.out.println(c.getNome()));
		
		cursos.stream()
			.mapToInt(Curso::getAlunos)
			.average()
			.ifPresent(media -> System.out.println("A média de alunos por curso é: " + media));
		
		List<Curso> List = cursos.stream()
				   .filter(c -> c.getAlunos() > 50)
				   .collect(Collectors.toList());
		
		
	}
}