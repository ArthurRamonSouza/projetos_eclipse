public class Conta {
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;

	public void deposita(double valor) {
		this.saldo = this.saldo += valor;	
	}
	
	public boolean saca(double valor) {
		if(this.saldo > valor) {
			this.saldo -= valor;
			return true;
		}else {
			System.out.println("Saque não efetuado!");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destinatario) {
		if(this.saldo > valor) {
			saca(valor);
			destinatario.deposita(valor);
			System.out.println("Transferência concluída!");
			return true;
		}else {
			System.out.println("Sem saldo suficiente!");
			return false;
		}
	}
	
	public double getSaldo() {
		System.out.println("Seu slado é: ");
		return this.saldo;
	}
	
}