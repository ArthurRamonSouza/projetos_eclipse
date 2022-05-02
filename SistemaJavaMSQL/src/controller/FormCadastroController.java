package controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dao.Conexao;
import dao.UsuarioDao;
import model.Usuario;
import views.FormCadastroView;

public class FormCadastroController {
	private FormCadastroView view;

	public FormCadastroController(FormCadastroView view) {
		super();
		this.view = view;
	}

	public void cadastraUsuario() {
		String usuario = view.getTextField_Usuario().getText();	
		String senha = view.getPasswordFieldSenha().getText();
		
		try {
			Usuario user = new Usuario(usuario, senha);
			UsuarioDao userDao= new UsuarioDao(new Conexao().getConexao());
			userDao.insert(user);
			JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso.");
			
		} catch (SQLException e) {
			e.getMessage();
			e.printStackTrace();
		}
			
		
	}

	

	
}
