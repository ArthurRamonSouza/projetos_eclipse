package br.com.goldenbank.banco.modelo;

public class CalculadorDeImposto {

	private double totalImposto;
	
	public void registra(Tributavel t) {
		this.totalImposto += t.getValorImposto();
	}
	
	public double getTotalImposto() {
		return this.totalImposto;
	}
	
}
