<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Let's Donate</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<%if(session.getAttribute("username")!=null ){%>
<div class="container-fluid">
		<div class="row" style="height: 60px">
			<div class="col-12">
				<%@include file="AdminMasterPage.jsp"%>
			</div>
		</div>
<div class="row" style="margin-top: 60px;">
			<div class="col-12">

				<table class="table table-dark">
					<thead class="thead-dark" >
						<tr style="color:black;font-size:30px">
							<th scope="col">donor name</th>
							<th scope="col">donor Email</th>
							<th scope="col">donor Address</th>
							
							<th scop="col">Ngo </th>
							<th scope="col">category</th>
							<th scope="col">description</th>
							
							
						</tr>
					</thead>
					<tbody>
						<c:forEach var="list" items="${list}">
							<tr style="color:black;font-size:20px">
								<th><c:out value="${list.getDonorId().getName()}"></c:out></th>
								<th><c:out value="${list.getDonorId().getEmail()}"></c:out></th>
								<th><c:out value="${list.getDonorId().getAddress() }"></c:out></th>
								
								<th><c:out value="${list.getCollectedBy()}"></c:out></th>
								<th><c:out value="${list.getCategoryId() }"></c:out></th>
								<th><c:out value="${list.getDescription()}"></c:out></th>
								
								
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			</div>
			<%} %>
</body>
</html>