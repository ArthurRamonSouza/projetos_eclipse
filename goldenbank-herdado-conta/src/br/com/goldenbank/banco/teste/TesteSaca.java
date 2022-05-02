package br.com.goldenbank.banco.teste;

import br.com.goldenbank.banco.modelo.Conta;
import br.com.goldenbank.banco.modelo.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {
			
		Conta c = new ContaCorrente(123, 321);
		c.deposita(300);
		
		try{
			c.saca(200);
		}catch(Exception ex) {
			System.out.println("Saldo insuficiente!");
		}
		
		c.getSaldo();
		
	}

}
