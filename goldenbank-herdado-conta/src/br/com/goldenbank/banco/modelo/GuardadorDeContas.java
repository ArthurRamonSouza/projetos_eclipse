package br.com.goldenbank.banco.modelo;

public class GuardadorDeContas {

	private Conta[] referencias;
	private int varPosicao;
	
	public GuardadorDeContas () {
		this.referencias = new Conta[10];
		this.varPosicao = 0;
	}

	public void adiciona(Conta refConta) {
		this.referencias[varPosicao] = refConta;
		this.varPosicao++;
		
	}

	public int numeroDeCadastros() {
		return this.varPosicao;
	}

	public Conta getReferencia(int posicao) {
		return this.referencias[posicao];
	}
	
}
