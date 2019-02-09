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
<title>Insert title here</title>
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
						<tr>
							<th scope="col">name</th>
							<th scope="col">password</th>
							<th scope="col">username</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="list" items="${list}">
							<tr>
								<th><c:out value="${list.getName()}"></c:out></th>
								<th><c:out value="${list.getPassword()}"></c:out></th>
								<th><c:out value="${list.getUserName()}"></c:out></th>
								<th><a href="validate.htm?username=${list.getUserName()}">valid</a></th>
								<th><a href="Invalidate.htm?username=${list.getUserName()}">invalid</a></th>
							</tr>
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