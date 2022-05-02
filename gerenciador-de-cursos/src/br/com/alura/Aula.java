package br.com.alura;

public class Aula implements java.lang.Comparable<Aula> {
	private String titulo;
	private int tempo;

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "[Aula: " + this.titulo + ", Duração: " + this.tempo + " minutos]";
	}
	
	
	
}
