package br.com.goldenbank.banco.teste;

import br.com.goldenbank.banco.modelo.*;

public class TestArrayReferences {

	public static void main(String[] args) {
		
		//Conta[] contas = new Conta[5]; 
				
		ContaCorrente cc1 = new ContaCorrente(3234,20);
		ContaCorrente cc2 = new ContaCorrente(3432, 21);
		ContaPoupanca cp1 = new ContaPoupanca(5466, 67);
		ContaPoupanca cp2 = new ContaPoupanca (5466, 88);
		
		Conta[] contas = {cc1,cc2,cp1,cp2,null};
		
		System.out.println("A sua conta é a cc1? " + contas[0].equals(cc1) + "; Sua agencia é:" + contas[0].getAgencia());

		contas[0] = cc1;
		contas[1] = cp1;
		contas[2] = cc2;
		contas[3] = cp2;
		
		
		ContaCorrente ref = (ContaCorrente)contas[4];
		
		int totalContas = contas.length;
		
		System.out.println("Seu total de contas é: " + totalContas);
		System.out.println(contas[0].getAgencia() + " A sua conta é a cc1? " + contas[0].equals(cc1));
		System.out.println("Funcionou!" + ref.getAgencia());
		
	}

}
