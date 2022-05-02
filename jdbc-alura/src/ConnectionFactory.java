import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	public DataSource dataSource;

	public ConnectionFactory() {
		ComboPooledDataSource pool = new ComboPooledDataSource();
		pool.setJdbcUrl("jdbc:postgresql://localhost:5432/loja");
		pool.setUser("postgres");
		pool.setPassword("postgres");

		this.dataSource = pool;
	}

	public Connection recoverConnection() throws SQLException {
		return this.dataSource.getConnection();
	}
	
	/*
	 * public Connection recoverConnection() throws SQLException {
	 * System.out.println("Abrindo conexão!"); return
	 * DriverManager.getConnection("jdbc:postgresql://localhost:5432/loja",
	 * "postgres", "postgres");
	 * 
	 * }
	 */
}