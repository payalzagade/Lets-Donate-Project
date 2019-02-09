<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="spr" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Let's Donate</title>
</head>
<body>


	<%if(session.getAttribute("username")!=null ){%>

	<div class="container-fluid">
		<div class="row" style="height: 60px">
			<div class="col-12">
				<%@include file="AdminMasterPage.jsp"%>
			</div>
		</div>
		<div class="row">
			<div class="col-12">

				<table class="table">
					<thead class="thead-dark ">
						<tr style="color:black;font-size:30px">
							<th scope="col">username</th>
							<th scope="col">Name</th>
							<th scope="col">Address</th>
							<th scope="col">Registration no</th>
							<th scope="col">Mobile no</th>
							<th scope="col">Name</th>
							<th scope="col">Validate</th>
							<th scope="col">In Validate</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="list" items="${list}">
							<c:if test="${list.getIsValidated()=='no' }">
							<tr style="color:black;font-size:20px">
								<th><c:out value="${list.getuserName()}"></c:out></th>
								<th><c:out value="${list.getName()}"></c:out></th>
								<th><c:out value="${list.getAddress()}"></c:out></th>
								<th><c:out value="${list.getregistration_No()}"></c:out></th>
								<th><c:out value="${list.getMobileNo()}"></c:out></th>
								<th><c:out value="${list.getEmail()}"></c:out></th>
								<th><c:out value="${list.getCity()}"></c:out></th>
								<th><a href="validate.htm?username=${list.getuserName()}">valid</a></th>
								<th><a href="invalid.htm?username=${list.getuserName()}">invalid</a></th>
							</tr>
							</c:if>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<%}else{
	response.sendRedirect("AdminLoginMasterPage.jsp");
} %>
</body>
</html>