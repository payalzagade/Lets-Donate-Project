<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Let's Donate  </title>
</head>
<body>
<spr:form action="update_user.htm" method="post" commandName="user" >
		<spr:hidden path="userId" />
		User Name : <spr:input path="userName"/><br>
		User Role : <spr:select path="userRole">
			<spr:option value="admin"></spr:option>
			<spr:option value="operator"></spr:option>
		</spr:select><br>
		<input type="submit" value="Update" /><br>
	</spr:form>
</body>
</html>