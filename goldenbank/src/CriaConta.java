
public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 500;
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		primeiraConta.deposita(3000);
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo + " !");
		primeiraConta.transfere(1500, segundaConta);
		System.out.println(" Seu saldo é: " + segundaConta.saldo + " !");
		System.out.println(primeiraConta.titular);
	}
}
