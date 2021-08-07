
package day9;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {
	//void createEmployee()throws SQLException;
	void addEmployee(Employee employee) throws SQLException;
	void updateEmployee(Employee employee) throws SQLException;
	void deleteEmployee(int id) throws SQLException;
	List<Employee> getEmployees() throws SQLException;
	Employee getEmployeeById(int id)throws SQLException;

}
