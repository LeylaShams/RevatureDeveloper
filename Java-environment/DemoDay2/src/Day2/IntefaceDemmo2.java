package Day2;

interface IbankAccount {
	boolean deposit(double amount);
	boolean withdraw(double amount);
	void getBalanace();
}

class SavingAccount implements IbankAccount {
	
	private double _balance;
	private double _perDayLimit;
	
	@Override
	public boolean deposit(double amount) {
		
		_balance += amount;
		return true;
	}
		
	@Override
	public boolean withdraw(double amount) {
		if (_balance < amount) {
			System.out.println("Insufficient balance!");
			return false;
		}
		// limit 5000
		else if (amount > 5000) {
			System.out.println("withdraw attempt failed");
			return false;
		} else {
			
			_balance -= amount;
			_perDayLimit += amount;
			System.out.println("Successfully withdraw: " + amount);
			return true;
		}
	}
	@Override
	public void getBalanace() {
			System.out.println("Saving Account Balance" + _balance);
			
		}
		
	}
		


class CurrentAccount implements IbankAccount {
	private double _balance;
	
	@Override
	public boolean deposit(double amount) {
		_balance += amount;
		return true;
	}
	@Override
	public boolean withdraw(double amount) {
		if (_balance < amount) {
			System.out.println("Insufficient amount");
			return false;
		}
		else if (amount > 5000) {
			System.out.println("withdraw attempt failed");
			return false;	
		} else {
			
			_balance -= amount;
			
			System.out.println("Successfully withdraw: " + amount);
			return true;
		}
	}
	@Override
	public void getBalanace() {
		System.out.println("Saving Account Balance" + _balance);
		
	}
}

public class IntefaceDemmo2 {

	public static void main(String[] args) {
		
		//IbankAccount SavingAccount acc1 = new SavingAccount();
		//IbankAccount CurrentAccount acc2 = new CurrentAccount();
		
		// NOTICE!!! syntax!!!
		IbankAccount sa = new SavingAccount();
		IbankAccount ca = new CurrentAccount();
		
		sa.deposit(2000);
		sa.withdraw(5000);
		sa.withdraw(500);
		sa.getBalanace();
		
		ca.deposit(2000);
		ca.withdraw(5000);
		ca.withdraw(500);
		ca.getBalanace();
		
   

	}

}
