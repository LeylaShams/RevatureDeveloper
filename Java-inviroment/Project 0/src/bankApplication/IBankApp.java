package bankApplication;

import java.sql.SQLException;

public interface IBankApp {
	
	 boolean addUser(String name, String userName, String password, String type) throws  SQLException;
	 int login(String username, String password) throws SQLException;
	 void addAccount(int customerId, float balance, String type) throws SQLException;
	 float getBalance(int accountId, int userId) throws SQLException;
	 void deposit(int accountNum, float  amount) throws SQLException;
	 void withdraw(int userId, int accountNum, float amount) throws SQLException, InSufficientFundException;
	 void transfer(int userId, int accountNumFrom, int accountNumTo, float amount) throws SQLException, InSufficientFundException;
	 
	 
	 void getAllTransactions() throws SQLException;
	 void viewCustomerAcc(String userName) throws SQLException;
	 void setApprovalStatus(int accountId, Boolean status) throws SQLException;
	
	
	
	
	
	
}


