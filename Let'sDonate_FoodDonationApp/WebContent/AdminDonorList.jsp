<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spr" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Let's Donate</title>
</head>
<body>
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
							<th scope="col">password</th>
							<th scope="col">age</th>
							<th scope="col">name</th>
							<th scope="col">Gender</th>
							<th scope="col">Address</th>
							<th scope="col">Pincode</th>
							<th scope="col">City</th>
							<th scope="col">email</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="list" items="${list}">
							<tr style="color:black;font-size:20px">
								<th><c:out value="${list.getUserName()}"></c:out></th>
								<th><c:out value="${list.getPassword()}"></c:out></th>
								<th><c:out value="${list.getAge()}"></c:out></th>
								<th><c:out value="${list.getName()}"></c:out></th>
								<th><c:out value="${list.getGender()}"></c:out></th>
								<th><c:out value="${list.getAddress() }"></c:out></th>
								<th><c:out value="${list.getPincode()}"></c:out></th>
								<th><c:out value="${list.getCity() }"></c:out></th>
								
								<th><c:out value="${list.getEmail() }"></c:out></th>

							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</body>
</html>