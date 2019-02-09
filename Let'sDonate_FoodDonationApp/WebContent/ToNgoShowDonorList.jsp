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
<body >
<%if(session.getAttribute("username")==null) {response.sendRedirect("login.jsp");}else{%>
<div style="height: 30px">
 <%@include file="NgoMasterPage.jsp" %>
 </div>
 <div class="row" style="margin-top: 60px;">
			<div class="col-12">

				<table class="table table-dark" style="margin-left: 10px">
					<thead class="thead-dark" >
						<tr style="color:black;font-size:30px">
							<th scope="col" >donor name</th>
							<th scope="col">donor Email</th>
							<th scope="col">donor Address</th>
							<th scope="col">donor mobile no</th>
							<th scope="col">category</th>
							<th scope="col">description</th>
							<th scope="col">cook time</th>
							<th scope="col">accept if want</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="list" items="${list}">
							<tr style="color:black;font-size:20px">
								<th><c:out value="${list.getDonorId().getName()}"></c:out></th>
								<th><c:out value="${list.getDonorId().getEmail()}"></c:out></th>
								<th><c:out value="${list.getDonorId().getAddress() }"></c:out></th>
								<th><c:out value="${list.getDonorId().getMobileNo() }"></c:out></th>
								<th><c:out value="${list.getCategoryId() }"></c:out></th>
								<th><c:out value="${list.getDescription()}"></c:out></th>
								<th><c:out value="${list.getCookTime()}"></c:out></th>
								<th><a href="accept.htm?requestid=${list.getRequestId()}&categoryid=${list.getCategoryId()}" onclick="alertMsg()">accept</a></th>
								
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
			<%} %>
</body>
<script type="text/javascript">
function alertMsg(){
	window.alert("Your Request Has Been Accepted");
}

</script>
</html>