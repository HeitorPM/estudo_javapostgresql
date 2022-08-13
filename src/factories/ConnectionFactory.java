package factories;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	// atributos
	private static final String url = "jdbc:postgresql://localhost:5432/bd_aula03";
	private static final String user = "postgres";
	private static final String password = "120322";
	private static final String driver = "org.postgresql.Driver";

	// m�todo para abrir e retornar uma conex�o com o PostGreSQL
	public static Connection createConnection() throws Exception {
		Class.forName(driver);
		return DriverManager.getConnection(url, user, password);
	}

}
