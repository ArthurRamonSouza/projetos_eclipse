
public class TetstaEncapsulamento {

	public static void main(String[] args) {
		Conta conta = new Conta(3133, 65003134);
		conta.setTitular(new Cliente());
		
		Conta conta2 = new Conta(3133, 89900654);
		System.out.println(conta.getTitular());
		System.out.println(conta2.getAgencia());
		
		Conta testConstructorSecundary = new Conta(65003500);
		System.out.println(testConstructorSecundary.getAgencia());
		System.out.println(testConstructorSecundary.getNumero());
	
		Conta.getTotal();
			
	}
}
