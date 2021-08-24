package com.revature;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDaoImpl implements EmployeeDao{
	
	private static Statement statement= null;
	Connection connection = null;
	
	public  EmployeeDaoImpl() throws ClassNotFoundException {
		try {
			this.connection = ConnectionFactory.getConnection();
		}catch (SQLException ex){
			ex.printStackTrace();
			
		}
	}
	@Override
	public void addEmployee(Employee employee) throws SQLException {
		String sql = "insert into employee (name, email, gender, country) values (?, ?, ?, ?)";
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
	public void updateEmployee(Employee employee) throws SQLException {
		String sql = "update employee set name = ? email = ?, gender = ?, country = ? where id = ?";
		PreparedStatement ps = connection.prepareStatement(sql);
		ps.setString(1, employee.getName());
		ps.setString(2, employee.getEmail());
		ps.setString(3, employee.getGender());
		ps.setString(4, employee.getCountry());
		
		int count = ps.executeUpdate();
		if(count > 0) {
			System.out.println("employee record updated successfully");	
		}else {
			System.out.println("something went wrong");
		}	
	}

	@Override
	public List<Employee> getEmployees() throws SQLException {
        List<Employee> employees = new ArrayList<>();
        String sql = "select * from employee";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);
            String gender = resultSet.getString(4);
            String country = resultSet.getString(5);
            Employee employee = new Employee(id, name, email, gender, country);
            employees.add(employee);
        }
        return employees;
			
	}

	@Override
	public void deleteEmployee(int id) throws SQLException {
        String sql = "delete from employee where id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int count = preparedStatement.executeUpdate();
        if (count > 0)
            System.out.println("employee delete");
        else
            System.out.println("Oops! something went wrong");
		
	}
	@Override
	public Employee getEmployeeById(int id) throws SQLException {
        Employee employee = new Employee();
        String sql = "select * from employee where id = ?";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();

        if (resultSet == null) {
            int aid = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);
            String gender = resultSet.getString(4);
            String country = resultSet.getString(5);
            employee = new Employee(id, name, email, gender, country);
        }else{
            System.out.println("No record found");
        }
        return employee;
    }
	}



