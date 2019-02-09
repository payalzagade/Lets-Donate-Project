<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Let's Donate</title>
<meta charset="utf-8">
<link rel="stylesheet" href="css/creditly.css">
<link rel="stylesheet" href="css/style123.css">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<style>
.sticky {
	position: fixed;
	top: 0;
	width: 100%;
}
</style>
</head>
<body>
<nav class="navbar navbar-inverse sticky">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand font-weight-bolder" href="#">Let's Donate</a>
				<h4 class="font-white">welcome, <%= session.getAttribute("username") %></h4>
			</div>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="donate.htm"><span
						class="glyphicon glyphicon-user"></span>Donate</a></li>
				<li><a href=Feedback_Ngo.htm><span
						class="glyphicon glyphicon-user"></span>Feedback</a></li>
				
				<li><a href="logout.htm"><span
						class="glyphicon glyphicon-user"></span> Logout</a></li>
			</ul>
		</div>

	</nav>
</body>
</html>