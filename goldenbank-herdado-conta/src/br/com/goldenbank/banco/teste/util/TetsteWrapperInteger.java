package br.com.goldenbank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.goldenbank.banco.modelo.Conta;
import br.com.goldenbank.banco.modelo.ContaCorrente;

public class TetsteWrapperInteger {

	public static void main (String[] args) {
		
		Integer inteiro = Integer.valueOf(29);//autoboxing;
		inteiro.intValue();//unboxing;
		System.out.println(inteiro);
		
		int idade = Integer.valueOf(17);//autoboxing e unboxing;
		
		List<Number> numeros = new ArrayList<>();
		numeros.add(idade);
		numeros.add(inteiro);

	
		int int1 = (int) numeros.get(0);
		int int2 = (int) numeros.get(1);
		System.out.println(int1);
		System.out.println(int2);
		
		int parseandoPrimitivo = Integer.parseInt("49");
		Integer parseandoReferencia = Integer.valueOf("44");
		System.out.println("__________________");
		System.out.println(numeros);
		System.out.println("__________________");
		Collections.reverse(numeros);
		System.out.println(numeros);
		System.out.println("__________________");
		Collections.shuffle(numeros);
		System.out.println(numeros);
		System.out.println("__________________");
		Collections.rotate(numeros, idade);
		System.out.println(numeros);
		System.out.println("__________________");
		
		System.out.println(parseandoPrimitivo);
		System.out.println(parseandoReferencia);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		ContaCorrente c1 = new ContaCorrente(22, 33);
		ContaCorrente c2 = new ContaCorrente(44, 55);

		
		Comparador comparador = new Comparador();
		System.out.println(comparador.compare(c1, c2));
		//numeros.sort(null);
		System.out.println(c1.compareTo(c2));
		
		
	}
	
}
class Comparador {

	public int compare(ContaCorrente c1, ContaCorrente c2) {
		return Integer.compare(c1.getNumero(), c2.getNumero());
	}
	
	

}
