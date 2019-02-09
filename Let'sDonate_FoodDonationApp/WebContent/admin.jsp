<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Let's Donate</title>
</head>
<body>
<h1><%="Welcome As "+request.getAttribute("role") %></h1>
	<h2><a href="user_list.htm" >user list</a></h2>
 <a href="Feedback_Food.htm">DONOR</a>
 <a href="Feedback_Ngo.htm">NGO</a>
</body>
</html>