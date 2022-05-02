
public class Autenticador {
	int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Sua senha foi autenticada com sucesso! ");
			return true;
		}else {
			System.out.println("Sua senha não foi autenticada! ");
			return false;
		}
	}

}
