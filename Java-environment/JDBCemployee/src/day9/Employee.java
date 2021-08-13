package day9;

public class Employee {
	
	private int Id;
	private String Name;
	private String Email;
	 
	public Employee() {
		
	}
	public Employee(int Id, String Name, String Email) {
		this.Id = Id;
		this.Name = Name;
		this.Email = Email;
	}
	
	public int getId() {
		return this.Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public String getName() {
		return this.Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getEmail() {
		return this.Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	@Override
	public String toString() {
		return "Employee {" + Name + "Id: " + Id + "Email address: "  + Email + " }";
		
	}


}
