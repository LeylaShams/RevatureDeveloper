<html>
<head>
<meta charset="UTF-8">
<title>Expense Reimbursement System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
<script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript">
</script>

</head>
	 
<body >


 
<div class="container-fluid">
<div class="row">
	<div class="col-md-3"></div>
	<div class="col-md-6" style="text-align:center;" >
	 <h1>Expense Reimbursement System</h1>
        <h3>
         <a href="employee-list.jsp">Back to List of All Employees</a>
        </h3>

	
	<form action="http://localhost:8080/reimbursement/EmployeeServlet?action=add" method="post">
        <table>
        <tr>
                <th>Employee Name: </th>
                <td>
                 <input class="form-control" type="text" name="name" size="45"
                   
                  />
                </td>
            </tr>
            <tr>
                <th>Employee Email: </th>
                <td>
                 <input class="form-control"  type="text" name="email" size="45"
                   
                 />
                </td>
            </tr>
            <tr>
                <th>Username: </th>
                <td>
                 <input class="form-control"  type="text" name="username" size="15"
                   
                 />
                </td>
            </tr>
            <tr>
                <th>Password: </th>
                <td>
                 <input class="form-control" type="number" name="password" size="15"/>
                </td>
            </tr>
            <!-- <tr>
                <th>Type </th>
                <td>
				  <input type="radio" id="emp" name="type" value="Employee">
				  <label for="emp">Employee</label>
				  <br>
				  <input type="radio" id="manager" name="type" value="Finance manager">
				  <label for="manager">Finance manager</label>
                </td>
            </tr> -->
            <tr>
             <td colspan="2" align="center">
              <input type="submit" value="Save" />
             </td>
            </tr>
        </table>
   </form>
	
	
	</div>
	
	<div class="col-md-3"></div>
</div>

</div>
  
  
</body>
</html>