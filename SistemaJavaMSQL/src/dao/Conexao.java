package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/* Pacote DataAccesObject
 *  Esta classe é responsável por fazer a conexão entre o banco de dados e a aplicação.
 * Um método que faz isso, qual o drive que faz a conexão com o banco de dados (MySQL),
 * tratamento de erros, onde está o banco de dados, a senha e o usuário.
*/

public class Conexao {

	public Connection getConexao() throws SQLException{

		Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testejava", "postgres", "postgres");
		return conexao;	
		
	}
	

}
