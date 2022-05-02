
public class TesteReferencias {

	public static void main(String[] args) {
		
		Funcionario f = new EditorVideo();
		EditorVideo ev = new EditorVideo();
		Designer d = new Designer();
		Gerente g = new Gerente();
		ControleBonificacao controle = new ControleBonificacao();
		
		f.setSalario(1000);
		ev.setSalario(1000);
		d.setSalario(1000);
		g.setSalario(1000);
		
		System.out.println(f.getBonificacao());
		System.out.println(g.getBonificacao());
		
		controle.registraBonificacao(f);
		controle.registraBonificacao(ev);
		controle.registraBonificacao(d);
		controle.registraBonificacao(g);
		System.out.println(controle.getSomaBonificacao());
	}
	
}
