package day9;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	private static Connection connection = null;
	
	private ConnectionFactory() {
		
	}
	public static Connection getConnection() throws SQLException {
		
		if (connection == null) {
			ResourceBundle bundle = ResourceBundle.getBundle("/JDBCemployee/src/day9/dbConfig.properties");
			String url = bundle.getString("url");
			String username = bundle.getString("username");
			String password = bundle.getString("password");
			
			connection = DriverManager.getConnection(url, username, password);
			
		}
		return connection;
		
	}

}
