<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Let's Donate</title>
<meta charset="ISO-8859-1">

<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<!--Bootsrap 4 CDN-->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    
    <!--Fontawesome CDN-->
	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css" integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
	
	
<!-- //Style-sheets -->
<!-- web-fonts -->
<link href="//fonts.googleapis.com/css?family=Carter+One" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Roboto:300,400,500,700,900" rel="stylesheet">
<!-- //web-fonts -->
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Orphanage Donation Form  Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

 <style>
		html,body{
		background-image: url("images/bg.jpg");
		background-size: cover;
		background-repeat: no-repeat;
		height: 100%;
		font-family: 'Numans', sans-serif;
		}
		
		.container{
		height: 100%;
		align-content: center;
		}
		
		.card{
		height: 380px;
		margin-top: auto;
		margin-bottom: auto;
		width: 450px;
		background-color: rgba(0,0,0,0.5) !important;
		}
		
		.social_icon span{
		font-size: 60px;
		margin-left: 10px;
		color: #FFC312;
		}
		
		.social_icon span:hover{
		color: white;
		cursor: pointer;
		}
		
		.card-header h3{
		color: white;
		}
		
		.social_icon{
		position: absolute;
		right: 20px;
		top: -45px;
		}
		
		.input-group-prepend span{
		width: 50px;
		background-color: #FFC312;
		color: black;
		border:0 !important;
		}
		
		input:focus{
		outline: 0 0 0 0  !important;
		box-shadow: 0 0 0 0 !important;
		
		}
		
		.remember{
		color: white;
		}
		
		.remember input
		{
		width: 20px;
		height: 20px;
		margin-left: 15px;
		margin-right: 5px;
		}
		
		.login_btn{
		color: black;
		background-color: #FFC312;
		width: 100px;
		}
		
		.login_btn:hover{
		color: black;
		background-color: white;
		}
		
		.links{
		color: white;
		}
		
		.links a{
		margin-left: 4px;
		}
		
		.sticky {
			position: fixed;
			top: 0;
			width: 100%;
		}
		.left{
			display:flex;
			justify-content: flex-start;
			align-items: flex-start;
			
		}
</style>
	
</head>
<body>
<nav class="navbar navbar-inverse sticky">
		<div class="container-fluid" >
			<div class="navbar-header">
				<a class="navbar-brand" style="color:white; margin-left:-676px; font-weight: bolder; font-family:cursive; font-size: 35px;" href="#">Let's Donate</a>
			</div>
			
		</div>
</nav>
<div class="container">
	<div class="d-flex justify-content-center h-100">
		<div class="card">
			<div class="card-header">
				<h3>Sign In</h3>
			</div>
			<div class="card-body">
				<spr:form action="login1.htm" method="post" commandName="user" >
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-user"></i></span>
						</div>
						<spr:input type="text" class="form-control"  path="userName" placeholder="username" title="Alpha-Numeric and Username with 2-20 character" required="required" />
						
					</div>
					<div class="input-group form-group">
						<div class="input-group-prepend">
							<span class="input-group-text"><i class="fas fa-key"></i></span>
						</div>
						<spr:password class="form-control" path="password" placeholder="password"  title="Password (UpperCase, LowerCase, Number/SpecialChar and min 8 Chars)" required="required" />
					</div>
					
					<div class="form-group">
						<input type="submit" value="Login" class="btn float-right login_btn">
					</div>
			</spr:form>
			</div>
			<div class="card-footer">
				<div class="d-flex justify-content-center links">
					Don't have an account?<a href="reg3.htm">Sign Up</a>
				</div>
				
			</div>
		</div>
	</div>
</div>




</body>
</html>