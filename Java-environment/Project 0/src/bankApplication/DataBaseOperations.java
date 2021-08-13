package bankApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DataBaseOperations implements IBankApp{
	
	public static Statement statement = null;
	Connection connection = null;
	
	public DataBaseOperations() throws SQLException {
		try {
			this.connection = FirstConnectionFactory.getConnection();
		}  catch (SQLException throwables) {
			 throwables.printStackTrace();
		}
	}
	@Override
	public boolean addUser(String name, String userName, String password, String type) throws SQLException {
		String sql = "insert into user (name, user_name, user_pass, type) values (?, ?, ?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, name);
		preparedStatement.setString(2, userName);
		preparedStatement.setString(3, password);
		preparedStatement.setString(4, type);
		int count = preparedStatement.executeUpdate();
		if (count > 0) {
			System.out.println("User registered");
			return true;
		} else {
			System.out.println("something went wrong, please try again");
			return false;
		}
	}
	
	@Override
	public int login(String username, String password) throws SQLException {
		
        String sql = "select user_id from user where user_name = '" + username + "' AND user_pass = '" + password + "'";
        Statement statement = connection.createStatement();
        
        ResultSet resultSet = statement.executeQuery(sql);
       
        if (resultSet.next()) {
            int user_id = resultSet.getInt(1);
            return user_id;
           
        }else{
            System.out.println("No record found");
            return -1;
        }
	}
	
	@Override
	public void addAccount(int customerId, float balance, String type) throws SQLException {
		String sql = "insert into account (customer_id, balance, type) values (?, ?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, customerId);
		preparedStatement.setFloat(2, balance);
		preparedStatement.setString(3, type);
		int count = preparedStatement.executeUpdate();
		if (count > 0) {
			System.out.println("Account added");
		} else {
			System.out.println("something went wrong, please try again");
		}
	}
	
	@Override
	public float getBalance(int userId, int accountNum) throws SQLException {
        String sql = "select balance from account where customer_id = " + userId + " AND account_id = " + accountNum;
        Statement statement = connection.createStatement(); 
        ResultSet resultSet = statement.executeQuery(sql);
        
        if (resultSet.next()) {
            float balance = resultSet.getFloat(1);
            return balance;
           
        } else {
            System.out.println("No record found");
            return -1;
        }
	}
	
	@Override
	public void deposit(int accountNum, float  amount) throws SQLException {
		String sql = "update account set balance = balance +  ?  where account_id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setFloat(1, amount);
		preparedStatement.setInt(2, accountNum);
		int count = preparedStatement.executeUpdate();
		if (count > 0) {
			insertTransaction(accountNum, amount);
			System.out.println("Deposit successfully ");
		} else {
			System.out.println("something went wrong, please try again");
		}
	
	}
	@Override
	public void withdraw(int userId, int accountNum, float amount) throws SQLException, InSufficientFundException{
		float balance = getBalance(userId, accountNum);
		
		if (amount > balance) {
			  System.out.println("Please enter a valid amount");
	    	  System.out.println("Your balance is: $" + balance);
			throw new InSufficientFundException();
		} else {
		String sql = "update account set balance = balance - ? where account_id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setFloat(1, amount);
		preparedStatement.setInt(2, accountNum);
		
		int count = preparedStatement.executeUpdate();
		if (count > 0) {
			insertTransaction(accountNum, -1 * amount);
			System.out.println("Withdraw successfully ");
		} else {
			System.out.println("something went wrong, please try again");
		}
	}
}

	@Override
	public void transfer(int userId, int accountNumFrom, int accountNumTo, float amount) throws SQLException, InSufficientFundException {
		withdraw(userId, accountNumFrom, amount);
		deposit(accountNumTo, amount);
		insertTransfer(userId, accountNumFrom, accountNumTo, amount);
		
	}
	
	@Override
	public void getAllTransactions() throws SQLException {
        String sql = "select transaction_id, account.account_id, user.name, transaction.amount, transaction.date  from transaction"
        		+ " inner join account on transaction.account_id = account.account_id inner join user on user.user_id = account.customer_id";
        Statement statement = connection.createStatement();
        
        ResultSet resultSet = statement.executeQuery(sql);
       
        	while(resultSet.next()) {
        	System.out.println("Transaction#: " + resultSet.getInt(1) + " Acct #: " + resultSet.getInt(2) + " Customer Name: " + resultSet.getString(3) + " Amount: " + resultSet.getFloat(4) + " Date: " + resultSet.getDate(5));
        	}
	}
	
	private void insertTransaction(int accountNum, float  amount) throws SQLException {
		String sql = "insert into transaction (account_id, date, amount) values (?, now(), ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, accountNum);
		preparedStatement.setFloat(2, amount);
		preparedStatement.executeUpdate();
	}
	
	private void insertTransfer(int userId, int accountNumFrom, int accountNumTo, float  amount) throws SQLException {
		String sql = "insert into transfers(customer_id, from_account, to_account, date, amount) values (?, ?, ?, now(), ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, userId);
		preparedStatement.setInt(2, accountNumFrom);
		preparedStatement.setInt(3, accountNumTo);
		preparedStatement.setFloat(4, amount);
		preparedStatement.executeUpdate();

	}
	@Override
	public void viewCustomerAcc(String userName) throws SQLException{
		
	       String sql = "select user.user_name, user.name, account.account_id, account.balance, account.type, account.approved from user"
	       		+ " inner join account on user.user_id = account.customer_id where user_name = '"+ userName +"'";
	        Statement statement = connection.createStatement();
	        
	        ResultSet resultSet = statement.executeQuery(sql);
	        
        	while(resultSet.next()) {
        	System.out.println("name: " + resultSet.getString(1) + " account type:  " +
        	resultSet.getString(5) + " balance: $" + resultSet.getFloat(4) + " "+ (resultSet.getBoolean(6) ? " APPROVED": " REJECTED"));
        	}
 
      
	}
	@Override
	public void setApprovalStatus(int accountId, Boolean status) throws SQLException {
		String sql = "update account set approved = ?  where account_id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setBoolean(1, status);
		preparedStatement.setInt(2, accountId);
		int count = preparedStatement.executeUpdate();
		if (count > 0) {
			
			System.out.println("Account status updated successfully");
		} else {
			System.out.println("something went wrong, please try again");
		}
		
	}
	
	
}
