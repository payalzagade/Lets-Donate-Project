<%@page import="bean.User"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Let's Donate  </title>
</head>
<body>
<table>
<%if(session.getAttribute("username")==null) {response.sendRedirect("login.jsp");}else{%>
	<% 
		List<User> list = (List<User>)request.getAttribute("ulist");
		if(list!=null){
			for(User u: list){
	%>
	
		<tr>
			<td><%=u.getUserId() %></td>
			<td><%=u.getUserName() %></td>
			<td><%=u.getUserRole() %></td>
			<td><a href="delete_user.htm?userId=<%=u.getUserId()%>" >Delete</a></td>
			<td><a href="select_user.htm?userId=<%=u.getUserId()%>" >Select</a></td>
		</tr>
	
	<% }} } %>
	</table>
</body>
</html>