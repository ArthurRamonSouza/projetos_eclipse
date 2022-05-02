package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/* Pacote DataAccesObject
 *  Esta classe � respons�vel por fazer a conex�o entre o banco de dados e a aplica��o.
 * Um m�todo que faz isso, qual o drive que faz a conex�o com o banco de dados (MySQL),
 * tratamento de erros, onde est� o banco de dados, a senha e o usu�rio.
*/

public class Conexao {

	public Connection getConexao() throws SQLException{

		Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testejava", "postgres", "postgres");
		return conexao;	
		
	}
	

}
