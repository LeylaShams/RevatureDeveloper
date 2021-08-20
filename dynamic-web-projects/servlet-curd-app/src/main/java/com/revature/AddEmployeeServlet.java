package com.revature;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddEmployeeServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html");
		
		//PrintWriter out = response.getParameter("name");
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String rational = request.getParameter("country");
		
		Employee employee = new Employee();
		employee.setName(name);
		employee.setEmail(name);
		employee.setGender(gender);
		employee.setCountry(country);
	}

}
