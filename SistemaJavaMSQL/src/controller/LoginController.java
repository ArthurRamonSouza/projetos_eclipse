package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.Conexao;
import dao.UsuarioDao;
import model.Usuario;
import views.LoginView;
import views.MenuView;

public class LoginController {
	private LoginView view;

	public LoginController(LoginView view) {
		this.view = view;
	}
	
	public void autenticaUsuario() throws SQLException {
		//capture o login do usuario
		String usuario = view.getTextFieldUsuario().getText();
		String senha = view.getPasswordField_Senha().getText();
		
		Usuario usuarioASerAutenticado = new Usuario(usuario, senha);
		
		//confirme o login no bd 
		Connection conexao = new Conexao().getConexao();
		UsuarioDao userDao = new UsuarioDao(conexao);
		boolean confirmacao = userDao.autenticaUsuario(usuarioASerAutenticado);
		
		//direcione ou nao para o menu
		if (confirmacao) {
			MenuView telaMenu = new MenuView();
			telaMenu.setVisible(true);
		}else {
			JOptionPane.showMessageDialog(view, "Usuario ou senha incorretos ou usuario não cadastrado.");
		}
		
			
		
		
	}
	
}
