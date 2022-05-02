
public class TestaCliente {

	public static void main(String[] args) {

		Conta contaDoArthur = new Conta();
		contaDoArthur.titular = new Cliente();
		
		contaDoArthur.titular.nome = "Arthur";
		contaDoArthur.titular.cpf = "112.962.274-64";
		contaDoArthur.titular.profissao = "estudante";
		
		System.out.println(contaDoArthur.titular);
		System.out.println(contaDoArthur.titular.cpf);

	}

}
