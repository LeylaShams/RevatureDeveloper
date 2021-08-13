package libs;

import java.sql.*;

public class JDBCDemo2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Step 1: load the driver
		//Class.forName("com.mysql.jdbc.Driver");
		
		// Step 2: Create connection
		String host = "jdbc:mysql://localhost:3306/";
		String database = "revature";
		// jdbc:mysql://localhost:3306/revature;
		
		String connectionString = host + database;
		
		String username = "root";
		String password = "hassankachal";
		
		Connection conn = DriverManager.
				getConnection(connectionString, username,password);
		
		// Step 3: Create Statement object;
		
		Statement statement = conn.createStatement();
		
		// Step 4: Execute Queries
		
		
		
		// Demo 1: Create a table
		//String query = "create table employee2 (Id INTEGER PRIMARY KEY AUTO_INCREMENT, Name CHAR(20), Email CHAR(50))";
		//statement.executeUpdate(query);
		
		System.out.println("table created successfully");
		
		// Demo 2: Insert data into our table
		String query = "insert into employee2 (Name, Email) values(?, ?)";
		
		
		// Get PrepareStatement object
		PreparedStatement preparedStatement = conn.prepareStatement(query);
		
		// Set the values to query
		preparedStatement.setString(1, "Mark Smith");
		preparedStatement.setString(2, "m@gmail.com");
		
		// execute the query
		int rowAffected = preparedStatement.executeUpdate();
		System.out.println("("+rowAffected+") rows affected");
		
		// Demo 3: Update data of our table
		//String query = "update employee set name = ?, email = ? where id = ?";
		//PreparedStatement preparedStatement = conn.preparedStatement(query);
		//preparedStatement.setString(1, "Paul");
		//preparedStatement.setString(2, "p@gmail.com");
		//preparedStatement.setInt(3, 1);
		//int rowAffected = preparedStatement.executeUpdate();
		//System.out.println("(" + rowAffected + ") rows affected");
		//int rowAffected = 1;
		//System.out.println(String.format("(%d) rows affected", rowAffected));
		
		// Demo 5: Read the data from table
		String query2 = "select * from employee";
		
		ResultSet resultSet =  statement.executeQuery(query2);
		
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String name = resultSet.getString(2);
			String email = resultSet.getString(3);	
			
			System.out.println("Id = "+ id+ ", Name = "+ name+", Email: "+ email);
			
		//String name = "Sam";
	    //int age = 10;
		//String output = String.format("%s is %d years old", name, age);
	    //System.out.println(output);
			
		// Step 5: Close connection
		if (conn.isClosed() ) {
			System.out.println("connection closed");
		} else {
			System.out.println("connection open");
			//conn.close();
			}
		}
	
	}

}
