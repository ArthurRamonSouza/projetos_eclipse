package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExtendsJFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public ExtendsJFrame() {
		super();
		setSize(500, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		Container contentPane = getContentPane();
	 	contentPane.setLayout(new BorderLayout());
	 	
	 	JButton botaoEntrar = new JButton("Entrar");
	 	contentPane.add(botaoEntrar, BorderLayout.WEST);
		JButton botaoCadastrar = new JButton("Cadastrar");
	 	contentPane.add(botaoCadastrar, BorderLayout.EAST);
	}
	
}
 