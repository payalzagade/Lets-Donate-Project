<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="spr" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Let's Donate</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">


</head>
<body>
<%if(session.getAttribute("username")==null) {response.sendRedirect("login.jsp");}else{%>
  <div style="height: 30px">
  <%@include file="NgoMasterPage.jsp" %>
  </div>
  <div class="center-container">
  <h1 class="header-w3ls">Select Category</h1>
  <div style="margin-top: 60px ; font-size: 30px; color: white; " >
  <div class="content-top">
			

   <spr:form action="Tcheckbox2.htm" method="get" commandName="ngo" id="FC" >
   
  
     <spr:checkbox path="categoryOfInterest" value="1"   />Food</br>
 	 <spr:checkbox path="categoryOfInterest" value="3" />Cloths</br>
    <spr:checkbox  class="form-check-label" path="categoryOfInterest"  value="2"/>Books</br>
  
      <!--   <input type="checkbox" name="food" value="1" > food<br>
       <input type="checkbox" name="books" value="2" >book<br>
  <input type="checkbox" name="cloths" value="3" >cloth--><br>
  
  <input type="submit" value="Submit" onclick="valthisform();" >
</spr:form>
</div>
</div>
</div>

</div>
</body>
<%} %>
<script>
function valthisform(){
	 var chkd = document.getElementById("FC").childNodes;
		if(chkd[0].checked ||chkd[1].checked||chkd[1].checked){
				
			}
		else {
			 alert("data is stored successfully");
				
			}
	 
	}

</script>
</html>