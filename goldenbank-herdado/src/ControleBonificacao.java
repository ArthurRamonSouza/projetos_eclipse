public class ControleBonificacao {

	private double somaBonificacao;
	
	public void registraBonificacao(Funcionario funcionario) {
		double Boni = funcionario.getBonificacao();
		this.somaBonificacao = this.somaBonificacao + Boni;
	}
	
	public double getSomaBonificacao() {
		return this.somaBonificacao;
	}
	
}
