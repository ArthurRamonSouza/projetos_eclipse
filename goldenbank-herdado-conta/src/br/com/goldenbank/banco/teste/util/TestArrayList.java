package br.com.goldenbank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.goldenbank.banco.modelo.*;

public class TestArrayList {
	public static void main(String[] args){

		//List<Conta> lista = new ArrayList<Conta>(); //usa array por baixo
		//List<Conta> lista = new LinkedList<Conta>(); //lista linkada
        List<Conta> lista = new Vector<Conta>(); //usa array por baixo, mas tbm é threadsafe

	    Conta cc1 = new ContaCorrente(22, 22);
	    Conta cc2 = new ContaCorrente(22, 22);

	    lista.add(cc1);
	    boolean contido = lista.contains(cc2);
	    
	    boolean igualdade = cc1.equals(cc2);
	    
	    System.out.println("Contido: " + contido);
	    System.out.println("É a mesma conta? " + igualdade);
	    System.out.println("-----------------------");
	    
	    for(Conta conta : lista){
	        System.out.println(conta);
	    }
	}
}