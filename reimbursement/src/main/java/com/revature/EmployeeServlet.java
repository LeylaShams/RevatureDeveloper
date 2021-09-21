package com.revature;



import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Gson gson = new Gson();
    /**
     * Default constructor. 
     */
    public EmployeeServlet() 
    {
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		

        try {
            switch (action)
            {
            	case "getall":
            		GetAllEmployees(request, response);
            	break;          
                case "add":
                    addEmployee(request, response);
                    break;
                case "delete":
                    deleteEmployee(request, response);
                    break;
                case "update":
                    updateEmployee(request, response);
                    break;
                default:
                	GetAllEmployees(request, response);
                    break;
            }
        } 
        catch (Exception ex) {
            throw new ServletException(ex);
        }
		
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	private void updateEmployee(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html");
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String type = request.getParameter("type");
		
		Employee employee = new Employee();
		employee.setId(id);
		employee.setName(name);
		employee.setEmail(email);
		employee.setUsername(username);
		employee.setPassword(password);
		employee.setType(type);

		
		try {
			EmployeeDao dao = EmployeeDAOFactory.getEmployeeDao();
			dao.updateEmployee(employee);
			System.out.println("employee record updated successfully");
		} catch (SQLException e) {
			System.out.println("something went wrong1");
			e.printStackTrace();
		}catch (ClassNotFoundException e1) {
			System.out.println("something went wrong2");
			e1.printStackTrace();
		}	
	}
		
	

	private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
		
		response.setContentType("text/html");
		
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		Employee employee = new Employee();
		employee.setId(id);
		
		try {
			EmployeeDao dao = EmployeeDAOFactory.getEmployeeDao();
			dao.deleteEmployee(employee);
			System.out.println("employee record deleted successfully");
		} catch (SQLException e) {
			System.out.println("something went wrong1");
			e.printStackTrace();
		}catch (ClassNotFoundException e1) {
			System.out.println("something went wrong2");
			e1.printStackTrace();
		}	
	}
	

	private void addEmployee(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		// PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String type = request.getParameter("type");
		
		Employee employee = new Employee();
		employee.setName(name);
		employee.setEmail(email);
		employee.setUsername(username);
		employee.setPassword(password);
		employee.setType(type);
		
		
		try {
			EmployeeDao dao = EmployeeDAOFactory.getEmployeeDao();
			dao.addEmployee(employee);
			System.out.println("employee record inserted successfully");
		} catch (SQLException e) {
			System.out.println("something went wrong1");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}	
	
	}

	private void GetAllEmployees(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		try {
			EmployeeDao dao = EmployeeDAOFactory.getEmployeeDao();
			List<Employee> employees = dao.getAllEmployee();
			String jsonEmps = this.gson.toJson(employees);
			PrintWriter out = response.getWriter();
			response.setContentType("application/json");
			response.setCharacterEncoding("UTF-8");
			out.print(jsonEmps);
			out.flush();
		} catch (SQLException e) {
			System.out.println("something went wrong1");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}	
		
		
//		List<Employee> employees = new ArrayList<Employee>();
//		employees.add(new Employee(1, "M", "m@gmail.com", "m123", "123", "employee"));
//		employees.add(new Employee(2, "S", "m@gmail.com", "m123", "123", "employee"));
//		employees.add(new Employee(3, "N", "m@gmail.com", "m123", "123", "employee"));

//		String jsonEmps = this.gson.toJson(employees);
//		PrintWriter out = response.getWriter();
//		response.setContentType("application/json");
//		response.setCharacterEncoding("UTF-8");
//		out.print(jsonEmps);
//		out.flush();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
