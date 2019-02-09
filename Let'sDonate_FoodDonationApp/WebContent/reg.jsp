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
						<spr:form action="reg.htm" method="post" modelAttribute="user" >
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
									    <spr:errors cssStyle="color:red" path="password"></spr:errors>
										<label class="header"> Password </label>
										<spr:password path="password" id="name" name="name" placeholder=""  required="required" />
									</div>
									
									<div class="form-control">	
										<label class="header"> Email </label>
										<spr:input path="email" id="email" type="email" name="email" placeholder="" title="Please enter a Valid Email Address" required="required"/>
									</div>
									
									
								 <div class="form-control" id="hiddenDiv3" style="display:none">
                                        <label class="header">Gender</label>
                                        <spr:select path="gender" class="form-control" required="" > 
                                           <spr:option  value=""></spr:option>
                                            <spr:option value="Male"></spr:option>
                                            <spr:option value="Female"></spr:option>  
                                            <spr:option value="Other"></spr:option>     
                                        </spr:select>
                                    </div>
                                    
                                    <div class="form-control">
                                        <label class="header">Type</label>
                                        <spr:select path="userRole" class="form-control" onchange="java_script_:show(this.options[this.selectedIndex].value)" required="required" >
                                            <spr:option  value=""></spr:option>
                                            <spr:option value="Donor"></spr:option>
                                            <spr:option value="NGO"></spr:option>     
                                        </spr:select>
                                    </div>

								</div>
							</div>
					</div>
					<div class="form-w3ls-1">
						
								
						<div class="form-control"> 
							<label class="header">Address </label>
							<spr:input path="address" id="name" name="name" placeholder=""  title="please enter address" required="required"/>
						</div>	
						<div class="form-control"> 
							<label class="header">pin code </label>
							<spr:input path="pincode" id="name" name="name" placeholder="" title="Please enter your Full Name" required="required"/>
						</div>
						<div class="form-control">
								<label class="header" >City </label>		
									<spr:select required="required" title="please select an item in the list" path="city" class="form-control"  >
                                           <spr:option  value=""></spr:option>
                                            <spr:option value="Mumbai"></spr:option>
                                            <spr:option value="Pune"></spr:option>  
                                            <spr:option value="NaviMumbai"></spr:option>     
                                        </spr:select>
						</div>
						<div class="form-control" > 
									<label class="header"> locality </label>
                                <spr:input  path="locality" id="name" name="name" placeholder="" title="Please enter your locality"  required="required"/>
							</div>
							
							
							<div class="form-control" id="hiddenDiv" style="display:none"> 
									<label class="header"> Age </label>
                                <spr:input  path="age" id="name" name="name" placeholder="" type="number" title="Please enter your age" required=""/>
							</div>

                        <div class="form-control" id="hiddenDiv1" style="display:none">
                            <label class="header"> Registration Number </label>
                            <spr:input   path="registrationNo" id="name" name="name" placeholder="" title="Please enter your registration number" required="" />
                        </div>
					<div class="form-control">
							
                           <label class="header"> Mobile Number  </label>
                        	<spr:errors path="mobileNo" cssStyle="color:red"></spr:errors>
                            <spr:input  path="mobileNo" id="name" name="name" placeholder="+91"  required="required" />
                       			 </div>
                        
                        
									  <input type="submit" value="Registration">
					 </spr:form>				
					</div>
					 				
					<div class="clear"></div>
				</div>
			</div>	
				
				<p class="copyright">© 2019 Donation Website. All Rights Reserved | Design by <a href="https://www.facebook.com/">Let's Donate</a></p>
		</div>
	</div>


			
    <SCRIPT>
	function show(select_item) {
	    if (select_item == "Donor") {
		    hiddenDiv.style.visibility='visible';
		    hiddenDiv.style.display = 'block';
		    hiddenDiv3.style.visibility = 'visible';
		    hiddenDiv3.style.display = 'block';
		    hiddenDiv1.style.visibility = 'hidden';
		    hiddenDiv1.style.display = 'none';
		    hiddenDiv2.style.visibility = 'hidden';
		    hiddenDiv2.style.display = 'none';
			
	    }
	    else if (select_item == "NGO") {
	        hiddenDiv1.style.visibility = 'visible';
	        hiddenDiv1.style.display = 'block';
	        hiddenDiv2.style.visibility = 'visible';
	        hiddenDiv2.style.display = 'block';
	        hiddenDiv.style.visibility = 'hidden';
	        hiddenDiv.style.display = 'none';
	        hiddenDiv3.style.visibility = 'hidden';
	        hiddenDiv3.style.display = 'none';
	        
	    }
		else{
			hiddenDiv.style.visibility='hidden';
			hiddenDiv.style.display='none';
		}
	}
	
    </SCRIPT>  

</body>
</html>