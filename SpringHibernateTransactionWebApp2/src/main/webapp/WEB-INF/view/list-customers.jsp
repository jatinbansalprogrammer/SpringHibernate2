<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css" />
	
	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
	<script src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
	
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
			<h3>${message}</h3>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
			<a href="ShowFormForAdd"><input type="button" value="Add Customer" class="add-button"/></a>
			<!--  add our html table here -->
			<table id="example">
				<thead>
				<tr>
					<th>firstName</th>
					<th>LastName</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				</thead>
				<tbody>
				<!-- loop over and print our customers -->
				<c:forEach var="listcustomer" items="${customerList}">
					<tr>
						<td>${listcustomer.first_name}</td>	
						<td>${listcustomer.last_name}</td>		
						<td>${listcustomer.email}</td>		
						<td><a href="<%=request.getContextPath() %>/customer/showFormForUpdate?customerId=${listcustomer.customerId}">Update</a>
						<a href="<%=request.getContextPath() %>/customer/deleteCustomer?customerId=${listcustomer.customerId}&firstname=${listcustomer.first_name}" onclick="if(!(confirm('are you sure you want to delete this user'))) return false" id="clickdelete">Delete</a></td>				
					</tr>
				</c:forEach>
			</tbody>			
			</table>
				
		</div>
		<div>
		</div>
	
	</div>
	
	<!-- <script>
		$(document).ready(function(){
			$("#clickdelete").click(function(){
				alert("are you sure you want to delete this customer");
			})
		});
	</script> -->

</body>

</html>









<script>

	$(document).ready(function() {
	    $('#example').DataTable();
	} );
	
	function abc(firstName,event){
		debugger;
		var b = confirm("Do you want to delete: " + firstName);
		if(!b){
			//event.preventDefault();
			return false;
		}
	}
</script>