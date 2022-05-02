
public class TesteGerente {

	public static void main(String[] args) {
		
		Gerente regis = new Gerente();
		regis.setCpf("165.887.982.64");
		regis.setNome("Reginaldo");
		regis.setSalario(3500);
		regis.setSenha(1);
		
		boolean autenticado = regis.autentica(0);
		System.out.println(regis.getNome());
		System.out.println(regis.getCpf());
		System.out.println(regis.getSalario());
		System.out.println("A senha foi autenticada: " + autenticado);
		System.out.println("Sua bonifica чуo щ: " + regis.getBonificacao());
	}
}
