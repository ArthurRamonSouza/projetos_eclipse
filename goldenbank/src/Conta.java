public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;

	public void deposita(double valor) {
		this.saldo = this.saldo += valor;	
	}
	
	public boolean saca(double valor) {
		if(this.saldo > valor) {
			this.saldo -= valor;
			return true;
		}else {
			System.out.println("Saque n�o efetuado!");
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destinatario) {
		if(this.saldo > valor) {
			saca(valor);
			destinatario.deposita(valor);
			System.out.println("Transfer�ncia conclu�da!");
			return true;
		}else {
			System.out.println("Sem saldo suficiente!");
			return false;
		}
	}
	
}