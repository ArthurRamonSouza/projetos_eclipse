import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestaDelete {

	public static void main(String[] args) throws SQLException {

		try(Connection con = new ConnectionFactory().recoverConnection()){
		String sql = "DELETE FROM produtos WHERE id > 2";
		PreparedStatement stm = con.prepareStatement(sql);
		stm.execute();
		int modifiedLines = stm.getUpdateCount();
		System.out.println("Linhas modificadas: " + modifiedLines);
		}
	}
}
