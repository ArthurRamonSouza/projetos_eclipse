public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
	}
	
	public Conta(int numero) {
		this(3334, numero);
	}
	
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
		System.out.println("Seu saldo é: ");
		return this.saldo = 0;
	}
	
	public int getAgencia() {
		System.out.println("Sua agência é: ");
		return this.agencia;
	}
	
	public int getNumero() {
		System.out.println("O número de sua conta é: ");
		return this.numero;
	}
	
	public Cliente getTitular() {
		return this.titular;
	} 
	
	public static int getTotal() {
		System.out.println("A quantidade de contas atualmente são: " + Conta.total);
		return Conta.total;
	}
	
	public void setTitular(Cliente cliente) {
		this.titular = cliente;
	}
		
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}