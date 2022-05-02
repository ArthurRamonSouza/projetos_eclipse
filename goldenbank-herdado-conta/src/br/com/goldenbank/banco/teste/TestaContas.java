package br.com.goldenbank.banco.teste;

import br.com.goldenbank.banco.modelo.ContaCorrente;
import br.com.goldenbank.banco.modelo.ContaPoupanca;
import br.com.goldenbank.banco.modelo.SaldoInsuficienteException;

public class TestaContas {

	public static void main(String[] args) throws SaldoInsuficienteException{

		ContaPoupanca cp = new ContaPoupanca(222,222);
		ContaCorrente cc = new ContaCorrente(111, 111);
		cp.saca(-300);
		cp.getSaldo();
		cc.deposita(1000);
		cp.deposita(2000);
		
		cc.transfere(197, cp);
		cc.getSaldo();
		cp.getSaldo();
		
		System.out.println(cc.toString());
		System.out.println(cp.toString());

		
	}

}
