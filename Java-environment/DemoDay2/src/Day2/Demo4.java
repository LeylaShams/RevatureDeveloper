package Day2;

class Employee {
	public int empId;
	public String name;
	public static String companyName = "Revature";
	
	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}
	public void printInfo() {
		System.out.println("Id: " + empId + ", name: " +
	name + ", Company name: " + companyName);
	}
}

public class Demo4 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(1, "Mark");
		Employee emp2 = new Employee(2, "Leyla");
		
		emp1.printInfo();
		emp2.printInfo();

	}

}
