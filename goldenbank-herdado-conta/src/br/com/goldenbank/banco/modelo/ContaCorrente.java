package br.com.goldenbank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double valorASacar = valor + 0.2;
		 super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo = super.saldo += valor;	
		
	}

	@Override
	public double getValorImposto() {
		return this.saldo*0.1;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente, " + super.toString();
	}
	
}
