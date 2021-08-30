package com.revature.project1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//@Entity(name = "employee_table")
@Entity
public class Employee {
	@Id
	private int id;
	private String username;
	private String password;
	private String name;
	private String type; // for determining if is employee or finance manager.

	public Employee() {

	}
	
	public Employee(int id, String username, String password, String name, String type) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", password=" + password + ", name=" + name + ", type="
				+ type + "]";
	}


}
