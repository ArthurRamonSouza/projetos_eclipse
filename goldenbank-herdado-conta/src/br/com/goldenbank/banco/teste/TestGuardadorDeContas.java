package br.com.goldenbank.banco.teste;

import br.com.goldenbank.banco.modelo.Conta;
import br.com.goldenbank.banco.modelo.ContaCorrente;
import br.com.goldenbank.banco.modelo.ContaPoupanca;
import br.com.goldenbank.banco.modelo.GuardadorDeContas;

public class TestGuardadorDeContas {

	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente(22, 11);
		ContaPoupanca cp1 = new ContaPoupanca(33, 45);
		GuardadorDeContas bancoDeContas = new GuardadorDeContas();
		
		bancoDeContas.adiciona(cc1);
		bancoDeContas.adiciona(cp1);
		int quantidadeDeCadastros = bancoDeContas.numeroDeCadastros();
		
		System.out.println(quantidadeDeCadastros);
		
		Conta ref = bancoDeContas.getReferencia(0);
		System.out.println(ref.getAgencia());
		
	}

}
