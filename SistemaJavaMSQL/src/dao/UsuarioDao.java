package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class UsuarioDao {

	private final Connection connection;

	public UsuarioDao(Connection connection) {
		this.connection = connection;
	}
	
	public void insert(Usuario usuario) throws SQLException {
		String sql = "insert into usuarios(usuario, senha) values ( ?, ?);";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, usuario.getNomeUsuario());
		statement.setString(2, usuario.getSenha());
		statement.execute();

	}

	public boolean autenticaUsuario(Usuario usuarioASerAutenticado) throws SQLException {
		String sql = "select * from usuarios where usuario = ? and senha = ?;";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, usuarioASerAutenticado.getNomeUsuario());
		statement.setString(2, usuarioASerAutenticado.getSenha());
		statement.execute();
		ResultSet result = statement.getResultSet();
		
		return result.next();
		
	}
	
	public void atualizaUsuario(Usuario user) throws SQLException {
		String sql = "update usuarios set usuario = ? and senha = ? where id = ?; ";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setString(1, user.getNomeUsuario());
		statement.setString(2, user.getSenha());
		statement.setInt(3, user.getId());
		statement.execute();
		
	}
	
	public void insertOuAtualizaUsuario(Usuario user) throws SQLException {
		
		if(user.getId()>0) {
			atualizaUsuario(user);
			
		}else {
			insert(user);
			
		}
		
	}
	
	public void delete(Usuario user) throws SQLException {
		String sql = "delete from usuarios where id = ?;";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setInt(1, user.getId());
		
	}
	
	public List<Usuario> solicitarTodosUsuarios() throws SQLException {
		String sql = "select* from usuarios;";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		ResultSet resultSet = statement.getResultSet();
		
		List<Usuario> listaDeUsuarios = new ArrayList<>();
		
		while (resultSet.next()) {
			
			String usuario = resultSet.getString("usuario");
			String senha = resultSet.getString("senha");
			int id = resultSet.getInt("id");
			
			listaDeUsuarios.add(new Usuario(id, usuario, senha));
			
		}
		
		return listaDeUsuarios;
		
	}
	
	public Usuario procuraUsuarioPeloId(Usuario user) throws SQLException {
		String sql = "select* from usuarios where id = ?;";
		PreparedStatement statement = connection.prepareStatement(sql);
		
		statement.setInt(1, user.getId());
		statement.execute();
		
		ResultSet resultSet = statement.getResultSet();
		
		Usuario userProcurado = null;
		
		if (resultSet.next()) {

			String usuario = resultSet.getString("usuario");
			String senha = resultSet.getString("senha");
			int id = resultSet.getInt("id");
			
			return userProcurado = new Usuario(id, usuario, senha);

		}
		return userProcurado;
		
	}
}
