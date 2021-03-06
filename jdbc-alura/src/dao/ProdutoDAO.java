package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class ProdutoDAO {
	
	private Connection connection;

	public ProdutoDAO(Connection conexao) {
		this.connection = conexao;
	}
	
	public void insert(Produto produto) throws SQLException {
		String sql = "INSERT INTO PRODUTOS (NOME, DESCRICAO) VALUES (?,?)";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			pstm.setString(1, produto.getNome());
			pstm.setString(2, produto.getDescricao());
			pstm.execute();
			
			try(ResultSet rst = pstm.getGeneratedKeys()){
				while(rst.next()) {
					produto.setId(rst.getInt(1));
				}
			}
		}
	}
	
	public List<Produto> list() throws SQLException{
		String sql = "SELECT* FROM PRODUTOS";
		List<Produto> list = new ArrayList<>();
		
		try(PreparedStatement pstm = connection.prepareStatement(sql)){
			pstm.execute();
			
			try(ResultSet rst = pstm.getResultSet()){
				while(rst.next()) {
					Produto produto = new Produto(rst.getInt(1), rst.getString(2), rst.getString(3));
					list.add(produto);
				}
			}
		}
		return list;
	}
}
