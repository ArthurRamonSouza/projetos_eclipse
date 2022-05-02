package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginView {

	public static void main(String[] args) {

		System.out.println(LoginView.class.getResource(".").getPath() + "imagemFundo.jpg");
		JFrame telaInicial = new JFrame();

		telaInicial.setSize(1000, 1000);
		telaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container layoutInicial = telaInicial.getContentPane();

		layoutInicial.setLayout(new FlowLayout());

		JButton botaoEntrar = new JButton("Entrar");

		layoutInicial.add(botaoEntrar);

		JButton botaoCadastrar = new JButton("Cadastrar");

		layoutInicial.add(botaoCadastrar);

		
		 ImageIcon imagemFundo = new ImageIcon(LoginView.class.getResource(".").getPath() + "imagemFundo.jpg");
		 JLabel campoImagem = new JLabel(imagemFundo); 
		 telaInicial.add(campoImagem);
		 

		telaInicial.setVisible(true);

	}

}
