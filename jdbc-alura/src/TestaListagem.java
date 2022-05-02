import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestaListagem {

	public static void main(String[] args) throws SQLException {

		try (Connection conexao = new ConnectionFactory().recoverConnection()) {
			String sql = "SELECT* FROM produtos";
			PreparedStatement stm = conexao.prepareStatement(sql);
			stm.execute();

			try (ResultSet rst = stm.getResultSet()) {
				while (rst.next()) {
					Integer id = rst.getInt(1);
					String nome = rst.getString(2);
					String descricao = rst.getString(3);
					System.out.println(id + " " + nome + " " + descricao);
				}
			}
		}
	}
}
