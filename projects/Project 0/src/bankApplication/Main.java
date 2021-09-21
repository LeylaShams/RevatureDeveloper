package bankApplication;

import java.sql.*;
import java.util.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;


public class Main {
  public static void main(String[] args) throws SQLException {
	
	  
	  Logger logger = Logger.getLogger(Main.class);
	  BasicConfigurator.configure();
	  logger.info("This is the first log4j's statement");
	  
	  DataBaseOperations db = new DataBaseOperations();
	  
	//IFirstBank account1 = FactoryBancAccounts.getAccount("CheckingAccount");
	//IFirstBank account2 = FactoryBancAccounts.getAccount("SavingAccount");
	//IFirstBank account3 = FactoryBancAccounts.getAccount("LoanAccount");
	  
	
	int userId = -1;
    boolean star = true;
	while (star) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("********************************");
	    System.out.println("PRESS 1 for customer access");
	    System.out.println("PRESS 2 for employee access");
	    System.out.println("********************************");
	    int num = scan.nextInt();
	    if (num >2) {
		  logger.error("User selected wrong option. Wrong option = " + num);
	    } else {
	    	logger.info("User selected option: " + num);
	    }
	    if (num == 1) {
        	// Customer
	        System.out.println("********************************");
	        System.out.println("PRESS 1 for sign in");
            System.out.println("PRESS 2 for sign up");
            System.out.println("********************************");
            num = scan.nextInt();
            if (num == 1 || num == 2) {
            	if (num == 1) {
                	// sign in
                	System.out.println("Type username: ");
                	String userName = scan.next();
                	System.out.println("Type user password: ");
                	String password = scan.next();
                	userId =  db.login(userName, password);
                } else if (num == 2) {
                	// sign up
                	System.out.println("Please enter your name: ");
                	String name = scan.next();
                	System.out.println("Please enter a username: ");
                	String username = scan.next();
                	System.out.println("Please enter a password: ");
                	String password = scan.next();
                	if (db.addUser(name, username, password, "customer")) {
                		userId = db.login(username, password);
                	}
                }
            	
                if (userId != -1) {
	                // Customer successfully logged in
	        		boolean flag = true;
	        		while (flag) {
		                Scanner scanner = new Scanner(System.in);
			        			
		                ConsoleUtils.printCustomerOptions();
			            
			           	int input1 = scanner.nextInt();
			           	
			           	switch(input1) {
				            case 1: {
			                    // apply
			                    System.out.print("What is the starting balance?");
			                    float balance = scanner.nextFloat();
			                	System.out.println("********************************");
			                    System.out.println("Select your account type: ");
			    	            System.out.println("PRESS 1 - checking acount");
			    	            System.out.println("PRESS 2 - saving account");
			    	            System.out.println("********************************");
			                    int accountType = scanner.nextInt();
			     
			                    db.addAccount(userId, balance, AccountUtil.getAccountTypeName(accountType));
			                    System.out.println("Account successfully created.");
			                    break;
			                }
				            case 2: {
				            	// view balance
				        	    System.out.println("********************************");
				        	    System.out.println("Please enter your account number");
				        	    int acctNum = scan.nextInt();
				        	    
				            	System.out.println("Your balance is: $" + db.getBalance(userId, acctNum));
				            	break;
				            }
				            case 3: {
				            	//make deposit
				        	    System.out.println("********************************");
				        	    System.out.println("Please enter your account number");
				        	    int acctNum = scan.nextInt();
				                System.out.println("********************************");
				        	    System.out.println("How much would you like to deposit?");
				        	    float amount = scan.nextFloat();
				        	    
				            	db.deposit(acctNum, amount);
				            	System.out.println("You deposited $" + amount + " successfully");
				            	break;
				            }
				            case 4: {
				            	//make withdraw
				        	    System.out.println("********************************");
				        	    System.out.println("Please enter your account number");
				        	    int acctNum = scan.nextInt();
				        	    
				        	    
					                System.out.println("********************************");
					        	    System.out.println("How much would you like to withdraw?");
					        	    float amount = scan.nextFloat();
					        	   
					        	    	try {
											db.withdraw(userId, acctNum, amount);
											System.out.println("Your withdraw of $" + amount + " was successfull");
						        	    	
										} catch (SQLException e) {
											
											//e.printStackTrace();
										} catch (InSufficientFundException e) {
											logger.info("Customer attempts to withdraw more than the account balance");
											//e.printStackTrace();
											
										}
					
				        	    break;
				            	
				            }
				            case 5: {
				            	//transfer
			                	System.out.println("********************************");
			                    System.out.println("Enter the account number to tranfer from: ");
			    	            
			    	            int acctNum1 = scan.nextInt();
			    	            System.out.println("********************************");
			                    System.out.println("Enter the account number to tranfer to: ");
			                    int acctNum2 = scan.nextInt();

			                 
				        	  
				        	 
				                    System.out.println("********************************");
				                    System.out.println("Enter the amount to transfer: ");
				                    float amount = scan.nextFloat();
					        	 
					        	    	try {
											db.transfer(userId, acctNum1, acctNum2, amount);
											System.out.println("Your transfer of $" + amount + " was successfull");
										} catch (SQLException e) {
											
											//e.printStackTrace();
										} catch (InSufficientFundException e) {
											logger.info("Customer attempts to transfer more than the account balance");
											
											//e.printStackTrace();
										}
		
				        	    break;
				            }
				            case 6: {
			                    // exit
			                    System.out.println("Thank you! We appreciate your business.");
			                    System.out.println("Exiting...");
			                    flag = false;
			                    break;
			                }
			           	}
	        		}
  	
                }
 
            } else {
            	// user entered a wrong option
            	System.out.println("Please select a valid option");
            	
            }
        } else if (num == 2) {
        	// EMPLOYEE
        	logger.info("Employee started using the system: " + num);
           
        	boolean employeeLoopFlag = true;
        	while(employeeLoopFlag) {
        	
        	ConsoleUtils.printEmployeeOptions();
        
            int optionNum = scan.nextInt();
            switch(optionNum) {
            
            case 1: {
            	//view a log of all transactions
            	logger.info("Employee started to view all the transactions: ");
            	db.getAllTransactions();
            	break;
            }
       
            case 2: {
            	//view a customer's bank accounts
            	logger.info("Employee started to view : ");
            	System.out.println("Enter customer's user name: ");
            	String userName = scan.next();
            	db.viewCustomerAcc( userName);
            	
            	break;
            }
            case 3: {
            	//approve or reject an account
            	
            	System.out.println("Enter account Id: ");
            	int accountId = scan.nextInt();
        	    System.out.println("********************************");
        	    System.out.println("PRESS 1  to approve");
        	    System.out.println("PRESS 2 reject");
        	    System.out.println("********************************");
        	    int status = scan.nextInt();
            	db.setApprovalStatus(accountId, status == 1);
            	logger.info("Employee set the appreval status: ");
            	break;
            }

            case 4: {
                // exit
                System.out.println("Thank you for your service!");
                System.out.println("Exiting...");
                employeeLoopFlag = false;
                star = false;
                break;
            	
            }
       }
   }
        } else {
        	// user entered wrong option 
        	 System.out.println("Please enter a valid option");
         }
                 
    	}
   }
}



                 
	  

  
