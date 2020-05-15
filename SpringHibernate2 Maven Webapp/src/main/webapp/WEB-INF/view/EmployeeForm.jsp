<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <style type="text/css">
  	.error{
  	color: red;
  	}
  
  </style>
    <base href="<%=basePath%>">
    
    <title>My JSP 'EmployeeForm.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	<form:form modelAttribute="employee" action="processEmployee">
  		Employee id <form:input path="empid"/><br><br>
  		<form:errors path="empid" cssClass="error"></form:errors><br><br>
  		Employee name<form:input path="empname"/><br><br>
  		<form:errors path="empname" cssClass="error"></form:errors><br><br>
  		Employee salary<form:input path="empsalary"/><br><br>
  		<form:errors path="empsalary" cssClass="error"></form:errors><br><br>
  		<input type="submit"/>
  	</form:form>
	
  </body>
</html>
