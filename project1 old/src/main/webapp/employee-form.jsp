
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<html>
<head>
 <title>Expense Reimbursement System</title>
</head>
<body>
 <center>
  <h1>Expense Reimbursement System</h1>
        <h3>
         <a href="employee-list.jsp">Back to List of All Employees</a>
         &nbsp;&nbsp;&nbsp;
         <!-- <a href="list">List All Employee</a> -->
         
        </h3>
 </center>
 
    <div align="center">
  <c:if test="${employee != null}">
   <form action="update" method="post">
        </c:if>
        <c:if test="${employee == null}">
    </div> 
 <center>    
  <div>   
   <form action="/addEmployee" method="post">
        </c:if>
        <table border="1" cellpadding="5">
            <caption>
             <h2>
              <c:if test="${employee != null}">
               Edit User
              </c:if>
              <c:if test="${employee == null}">
               Add New User
              </c:if>
             </h2>
            </caption>
          <c:if test="${employee != null}">
           <input type="hidden" name="id" value="<c:out value='${employee.id}' />" />
          </c:if>            
            <tr>
                <th>Employee Name: </th>
                <td>
                 <input type="text" name="name" size="45"
                   value="<c:out value='${employee.name}' />"
                  />
                </td>
            </tr>
            <tr>
                <th>Employee Email: </th>
                <td>
                 <input type="text" name="email" size="45"
                   value="<c:out value='${employee.email}' />"
                 />
                </td>
            </tr>
            <tr>
                <th>Username: </th>
                <td>
                 <input type="text" name="username" size="15"
                   value="<c:out value='${employee.username}' />"
                 />
                </td>
            </tr>
            <tr>
                <th>Password: </th>
                <td>
                 <input type="number" name="password" size="15"
                   value="<c:out value='${employee.password}' />"
                 />
                </td>
            </tr>
            <tr>
                <th>Type </th>
                <td>
				  <input type="radio" id="emp" name="hr" value="Employee">
				  <label for="emp">Employee</label>
				  <br>
				  <input type="radio" id="manager" name="hr" value="Finance manager">
				  <label for="manager">Finance manager</label>
                </td>
            </tr>
            <tr>
             <td colspan="2" align="center">
              <input type="submit" value="Save" />
             </td>
            </tr>
        </table>
        </form>
    </div> 
  </center>
    
</body>
</html>