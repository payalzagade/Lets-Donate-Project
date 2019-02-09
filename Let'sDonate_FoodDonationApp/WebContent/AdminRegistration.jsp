<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="spr" uri="http://www.springframework.org/tags/form" %> 

<!doctype html>
<html lang="en">
<head>
<title>Let's Donate</title>
<link rel="stylesheet" href="css/creditly.css">


<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- font files -->
<link href="//fonts.googleapis.com/css?family=Spectral" rel="stylesheet">
<!-- /font files -->
<!-- css files -->
<link href="css/style.css" rel='stylesheet' type='text/css' media="all" />
<!-- /css files -->
<link href="css/wickedpicker.css" rel="stylesheet" type='text/css' media="all" />


<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
</head>
<body>


<div class="w3-banner-main" style="80%" >
	
		<div class="center-container">
			<h1 class="header-w3ls">Registration Form</h1>
			<div class="content-top">
				<div class="content-w3ls">
					<div class="form-w3ls">
						<spr:form action="adminRegistration.htm" method="post" commandName="admin" >
							<div class="content-wthree1">
								<div class="grid-agileits1">
									<div class="form-control"> 
										<label class="header "> Name </label>
										<spr:input path="name" id="name" name="name" placeholder="" pattern="^[a-zA-Z][a-zA-Z0-9-_\.]{1,20}$" title="Name with 2-20 character" required="required"  />
									</div>

                                    <div class="form-control"> 
										<label class="header"> UserName </label>
										<spr:input path="userName" id="name" name="name" placeholder="" title="Please enter your Full Name" required=""/>
									</div>
									
									 <div class="form-control"> 
										<label class="header"> Password </label>
										<spr:password path="password" id="name" name="name" placeholder="" pattern="(?=^.{8,}$)((?=.*\d)|(?=.*\W+))(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$" title="Password (UpperCase, LowerCase, Number/SpecialChar and min 8 Chars)" required="required" />
									</div>

								</div>
							</div>
							 <input type="submit" value="Registration">
					</div>	
                        
									 
					 </spr:form>				
					</div>
					 				
					<div class="clear"></div>
				</div>
			</div>	
				
				<p class="copyright">© 2019 Donation Website. All Rights Reserved | Design by <a href="https://www.facebook.com/">Let's Donate</a></p>
		</div>
	</div>
		
	</body>
	</html>								
									