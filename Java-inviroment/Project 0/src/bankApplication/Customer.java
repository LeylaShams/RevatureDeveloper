package bankApplication;

public class Customer {
	
	private int userId;
	private String name;
	

	public Customer() {
		
	}
	
	public Customer (int user_id, String name, String email ) {
		this.userId = user_id;
		this.name = name;
		
	}
	public int getCustomer_id() {
		return userId;
	}
	public void setCustomer_id(int customer_id) {
		this.userId = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Customer {" + name + ", Id: " + userId + " }";
	}

}
