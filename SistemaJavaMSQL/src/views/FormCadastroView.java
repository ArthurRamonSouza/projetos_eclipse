package views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.FormCadastroController;

public class FormCadastroView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_Usuario;
	private JPasswordField passwordFieldSenha;
	private FormCadastroController controller;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCadastroView frame = new FormCadastroView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormCadastroView() {
		
		controller = new FormCadastroController(this);
		
		setTitle("Tela de Cadastro");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		passwordFieldSenha = new JPasswordField();
		passwordFieldSenha.setBounds(136, 212, 200, 30);
		contentPane.add(passwordFieldSenha);
		
		textField = new JTextField();
		textField.setBounds(136, 46, 200, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_Usuario = new JTextField();
		textField_Usuario.setColumns(10);
		textField_Usuario.setBounds(136, 128, 200, 30);
		contentPane.add(textField_Usuario);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(42, 42, 150, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setForeground(Color.WHITE);
		lblUsurio.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUsurio.setBounds(42, 124, 150, 30);
		contentPane.add(lblUsurio);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(Color.WHITE);
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSenha.setBounds(42, 208, 150, 30);
		contentPane.add(lblSenha);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				controller.cadastraUsuario();
							
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(143, 293, 200, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(FormCadastroView.class.getResource("/views/imagens/fundoLogin.jpg")));
		lblNewLabel_1.setBounds(0, 0, 500, 400);
		contentPane.add(lblNewLabel_1);
		
	}

	public JTextField getTextField_Usuario() {
		return textField_Usuario;
	}

	public JPasswordField getPasswordFieldSenha() {
		return passwordFieldSenha;
	}

}
