
public class SistemaInterno {

	private int senha = 180406;
	
	public boolean autentica(Autenticavel pessoa) {
		boolean autenticado = pessoa.autentica(this.senha);
		if(autenticado) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
