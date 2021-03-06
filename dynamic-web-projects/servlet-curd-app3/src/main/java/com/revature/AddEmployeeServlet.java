package com.revature;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addEmployee")
public class AddEmployeeServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String country = request.getParameter("country");
		
		Employee employee = new Employee();
		
		employee.setName(name);
		employee.setEmail(email);
		employee.setGender(gender);
		employee.setCountry(country);
		
		
		try {
			EmployeeDao dao = EmployeeDAOFactory.getEmployeeDao();
			dao.addEmployee(employee);
			System.out.println("employee record inserted");
		} catch (SQLException e) {
			System.out.println("something went wrong1");
			e.printStackTrace();
		}catch (ClassNotFoundException e1) {
			System.out.println("something went wrong2");
			e1.printStackTrace();
		}	
	}

}
