
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario cris = new Gerente ();
		cris.setNome("Cristovão");
		cris.setCpf("648.987.123-33");
		cris.setSalario(1045);
		
		System.out.println(cris.getNome());
		System.out.println(cris.getCpf());
		System.out.println(cris.getSalario());
		System.out.println(cris.getBonificacao());

		
		
	}
}
