package day9;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAOImpl implements EmployeeDAO {
	
	public static Statement statement = null;
	Connection connection = null;
	
	public EmployeeDAOImpl() throws SQLException {
		try {
			this.connection = ConnectionFactory.getConnection();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		
	}
	/*
	public void createTable() throws SQLException {
		
		String sql = "create table employee (id INTEGER PRIMARY KEY AUTO_INCREMENT, name Char(50), email CHAR(50))";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		int count = preparedStatement.executeUpdate();
		if (count > 0) {
			System.out.println("table created successfully");
		} else {
			System.out.println("Oops! something went wrong");
		}
	}
	*/
	

	@Override
	public void addEmployee(Employee employee) throws SQLException {
		String sql = "insert into employee (name, email) values (?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, employee.getName());
		preparedStatement.setString(2, employee.getEmail());
		int count = preparedStatement.executeUpdate();
		if (count > 0) {
			System.out.println("employee saved");
		} else {
			System.out.println("Oops! something went wrong");
		}
		
		
	}

	@Override
	public void updateEmployee(Employee employee) throws SQLException {
		String sql = "update employee set name = ?, email = ? where id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, employee.getName());
		preparedStatement.setString(2, employee.getName());
		preparedStatement.setInt(3, employee.getId());
		int count = preparedStatement.executeUpdate();
		if (count > 0) {
			System.out.println("employee updated");
		} else {
			System.out.println("Oops! something went wrong");
		}
	}

	@Override
	public void deleteEmployee(int id) throws SQLException {
		String sql = "delete from employee where id = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, id);
		int count = preparedStatement.executeUpdate();
		if (count > 0) {
			System.out.println("employee delete");
		} else {
			System.out.println("Oops! something went wrong");
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
            Employee employee = new Employee(id, name, email);
            employees.add(employee);
		}
		return employees;
	}

	@Override
	public Employee getEmployeeById(int empId) throws SQLException {
		Employee employee = new Employee();
		String sql = "select * from employee where id = " + empId;
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        if (resultSet == null) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            String email = resultSet.getString(3);
            employee = new Employee(id, name, email);
        }else{
            System.out.println("No record found");
        }
        return employee;
	}

}
