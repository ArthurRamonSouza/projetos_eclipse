package br.com.goldenbank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

	    String nome = "Mario"; //object literal
	    String outro = new String("Alura"); //m� pr�tica, sempre prefere a sintaxe literal
	    
	    String novo = outro.replace("A", "a");
	    System.out.println(novo);
	    
	}
}