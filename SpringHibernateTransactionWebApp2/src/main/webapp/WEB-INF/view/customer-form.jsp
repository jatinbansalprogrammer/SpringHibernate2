<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add customer page</title>
</head>
<body>
<form:form modelAttribute="customer" action="saveCustomer" method="POST">
	<h3>Save Customer</h3>
	<table>
		<tbody>
			<tr>
				<td>
					<label>First Name:</label>
					<form:input path="first_name"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Last Name:</label>
					<form:input path="last_name"/>
				</td>
			</tr>
			<tr>
				<td>
					<label>Email:</label>
					<form:input path="email"/>
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit"/>
				</td>
			</tr>
			<tr>
			
				<td><a href="<%=request.getContextPath()%>/customer/list">back to list</a></td>
			</tr>
		</tbody>
	</table>
</form:form>
</body>
</html>