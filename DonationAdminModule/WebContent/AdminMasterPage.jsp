<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
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
      <a class="navbar-brand" href="#">CharityPlus</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
     
    </ul>
    <ul class="nav navbar-nav navbar-right">
     <li><a href="NGOValidationPage.jsp"><span class="glyphicon glyphicon-user"></span>NGO Validation</a></li>
    <li><a href="FeedbackofDonorPage.jsp"><span class="glyphicon glyphicon-user"></span>Feedback of Donor</a></li>
    <li><a href="FeedbackofNGOPage.jsp"><span class="glyphicon glyphicon-user"></span>Feedback of NGO</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Out</a></li>
    </ul>
  </div>
</nav>
  
</body>
</html>