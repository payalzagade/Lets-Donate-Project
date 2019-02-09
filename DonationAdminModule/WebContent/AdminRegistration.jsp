<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="spr" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.invalid{
borde
}
</style>

</head>
<body>

	<spr:form action="adminRegistration.htm" commandName="admin" id="adminRegistration">
			Name:<spr:input path="name" />
		</br>
			Username:<spr:input path="userName" />
		</br>
			Password:<spr:password path="password" />
		</br>
		<!--  
			<input type="file" name="pdf" accept="pdf/*"></br>-->
		<input type="submit" value="submit" id="submit">
	</spr:form>


<script src="assets/js/jquery-2.1.4.min.js"></script>
	<script>
	$(document).ready(function() {
		$("#submit").on('click', function(e){
	        e.preventDefault();
			let flag = true;
	        
			var input = $("#userName").val();
			if(input){
				$('#userName').removeClass("invalid").addClass("valid");
				$('#userName').next('span').remove();
			}
			else {
				if($('#userName').next('span').length == 0) {
					$('#userName').after('<span class="text-danger">Name can\'t be empty!</span>');
				} 					
				$('#userName').removeClass("valid").addClass("invalid");
				flag = false;
			}
			
			regex = /^.{6,}$/;
			var is_password = regex.test($('#password').val());
			if(is_password){
				$('#password').removeClass("invalid").addClass("valid");
				$('#password').next('span').remove();
			}
			else {
				if($('#password').next('span').length == 0) {
					$('#password').after('<span class="text-danger">Password should be minimum 6 characters!</span>');
				}
				$('#password').removeClass("valid").addClass("invalid");
				flag = false;
			}
			
			
			if(flag==true) {
				 $("#adminRegistration").submit();
			} 
		});
		);
	
		</script>
		</body>
</html>