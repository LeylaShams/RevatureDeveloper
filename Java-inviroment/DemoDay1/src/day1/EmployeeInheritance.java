package day1;

class Employee {
	public int empId;
	public String firstName;
	public String lastName;
	public String email;
	public int salary;
	
	public void getFullName(String firstName, String lastName, int salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary= salary;
		
		System.out.println(this.firstName + " " + this.lastName +
				", " + this.salary);
	}
}
class FullTimeEmployee extends Employee {
	
	public int annualSalary = 200000;
	
	public int getSalary() {
		return this.salary = annualSalary;
	}
	
	
}
class PartTimeEmployee extends Employee {
	
	public int hourSalary = 20;
	
	public int getSalary() {
		return this.salary = hourSalary;
	}
}


public class EmployeeInheritance {

	public static void main(String[] args) {
		
		FullTimeEmployee fte = new FullTimeEmployee();
		//fte.firstName = "Paul";
		//fte.lastName = "Watson";
		//fte.annualSalary = 200000;
		
		
		PartTimeEmployee pte = new PartTimeEmployee();
		//pte.firstName = "Leyla";
		//pte.lastName = "Shams";
		//pte.hourSalary = 20;
		
		
		fte.getFullName("Paul", "Watson", fte.getSalary());
		pte.getFullName("Leyla", "Shams", pte.getSalary());
		
		
		Employee emp = new Employee();
		System.out.println("WELL DONE!");
	}

}
