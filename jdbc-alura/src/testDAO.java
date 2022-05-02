import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dao.ProdutoDAO;
import model.Produto;

public class testDAO {
	
	public static void main(String[] args) throws SQLException {
		try (Connection conexao = new ConnectionFactory().recoverConnection()) {

			List<Produto> listaProdutos = new ProdutoDAO(conexao).list();
			for (Produto produto : listaProdutos) {
				System.out.println(produto.toString());
			}
		}
	}

}
