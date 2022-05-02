package views;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.LoginController;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JButton btnCadastrar;
	private JPasswordField passwordField_Senha;
	private JTextField textFieldUsuario;
	private LoginController controlador;

	/**
	 * Launch the application.
	 */	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		controlador = new LoginController(this);
		setTitle("Tela de Acesso");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBackground(Color.WHITE);
		textFieldUsuario.setBounds(154, 86, 200, 30);
		contentPane.add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		JButton btnNewButton = new JButton("Entrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controlador.autenticaUsuario();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(60, 253, 100, 30);
		contentPane.add(btnNewButton);
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormCadastroView telaCadastro = new FormCadastroView();
				telaCadastro.setVisible(true);
			}
		});
		btnCadastrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCadastrar.setBounds(212, 253, 200, 30);
		contentPane.add(btnCadastrar);
		
		passwordField_Senha = new JPasswordField();
		passwordField_Senha.setBounds(154, 168, 200, 30);
		contentPane.add(passwordField_Senha);
		
		JLabel lblNewLabel_1 = new JLabel("Usu\u00E1rio");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(42, 82, 100, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(42, 164, 100, 30);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 496, 372);
		lblNewLabel.setIcon(new ImageIcon(LoginView.class.getResource("/views/imagens/fundoLogin.jpg")));
		contentPane.add(lblNewLabel);
				
	}

	public JPasswordField getPasswordField_Senha() {
		return passwordField_Senha;
	}

	public JTextField getTextFieldUsuario() {
		return textFieldUsuario;
	}

}
