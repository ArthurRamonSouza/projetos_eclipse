package view;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameTest {

	public static void main(String[] args) {
		
		JFrame janela = new JFrame();
		
		janela.setSize(300, 200);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
				
		new ExtendsJFrame();
		

		



		
	}
}
