
public class TesteSistema {

	public static void main(String[] args) {
		
		SistemaInterno si = new SistemaInterno();
		Gerente g1 = new Gerente();
		Administrador adm1 = new Administrador();
		Cliente c1 = new Cliente();
		
		g1.setSenha(180406);
		c1.setSenha(104061);
		adm1.setSenha(180406);
		
		System.out.println(si.autentica(c1));
		System.out.println(si.autentica(adm1));
		System.out.println(si.autentica(g1));
		

	}

}
