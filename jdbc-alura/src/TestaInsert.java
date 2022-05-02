import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaInsert {

	public static void main(String[] args) throws SQLException {

		Connection conexao = new ConnectionFactory().recoverConnection();
		conexao.setAutoCommit(false);
		
		try (PreparedStatement stm = 
				conexao.prepareStatement("INSERT INTO PRODUTOS (nome, descricao) VALUES (?,?)", Statement.RETURN_GENERATED_KEYS);
			){
			adicionarProduto("Cadeira gamer", "Com apoio para coluna e almofada", stm);
			adicionarProduto("Mesa eletrônica", "Mesa grande e com ajuste eletrônico", stm);
			
			conexao.commit();
			
			stm.close();
			conexao.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Dando o RollBack");
			conexao.rollback();
		}
	}

	private static void adicionarProduto(String sqlNome, String sqlDescricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, sqlNome);
		stm.setString(2, sqlDescricao);
		
		if(sqlNome == "Mesa eletrônica") {
			throw new RuntimeException("Não podemos vender mesas!");
			
		}
		
		stm.execute();
		ResultSet rst = stm.getGeneratedKeys();
		while(rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("Id do objeto criado: " + id);
		}
	}
}
