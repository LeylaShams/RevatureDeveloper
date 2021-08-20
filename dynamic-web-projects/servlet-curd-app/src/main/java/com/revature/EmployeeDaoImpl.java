package com.revature;

import java.sql.*;
import java.util.List;



public class EmployeeDaoImpl implements EmployeeDao{
	
	private static Statement statement= null;
	Connection connection = null;
	
	public  EmployeeDaoImpl() {
		try {
			this.connection = ConnectionFactory.getConnection();
		}catch (SQLException ex){
			ex.printStackTrace();
			
		}
	}

	@Override
	public void addEmployee(Employee employee) throws SQLException {
		String sql = "insert into Emploee (name, email, gender, country) values (?, ?, ?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, employee.getName());
		preparedStatement.setString(2, employee.getEmail());
		preparedStatement.setString(3, employee.getGender());
		preparedStatement.setString(4, employee.getCountry());
		int count = preparedStatement.executeUpdate();
		if (count > 0){
			System.out.println("employee saved");
		}else {
			System.out.println("something went wrong");
		}
		
			
		}
	

	@Override
	public void updateEmployee(Employee employee) {
		
		
	}

	@Override
	public void deleteEmployee(int id) {
		
		
	}

	@Override
	public List<Employee> getEmployees() {
		
		return null;
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		return null;
	}

}
