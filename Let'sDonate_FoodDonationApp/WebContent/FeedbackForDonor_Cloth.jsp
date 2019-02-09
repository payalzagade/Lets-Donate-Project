<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spr" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Let's Donate</title>
<!-- Style-sheets -->
<link rel="stylesheet" href="css/creditly.css">
<link rel="stylesheet" href="js/creditly.js">
<link rel="stylesheet" href="css/FeedbackStyle.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="Stylesheet" href="netdna.bootstrapcdn.com/font-awesome/3.2.1/css/font-awesome.css">
<link rel="Stylesheet" href="css/style123.css">
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
<!-- //Meta tag Keywords -->
  
<style>
 .fontify{
     font-size: 25px;
     color:white;
     font-family: 'Times New Roman', Times, serif;
 }
.left{
	display:flex;
   justify-content:flex-end;
   align-items:flex-start;
   }
 .fontify1{
     font-size: 15px;
     color:white;
     font-family: 'Times New Roman', Times, serif;
     
   }

 
</style>

</head>
<body>
 <%if(session.getAttribute("username")==null){response.sendRedirect("link.jsp"); }else{ %>
<h1 style="color:black">Feedback Form For Cloth</h1>
	<div class="w3layouts">
		<div class="donate_form_w3l">
			
			
            
		<spr:form action="Feedback_response_Cloth.htm" method="post" modelAttribute="response">
           
          
                   
                     <div id="Quetion1" >
				           <label class="fontify">1.How was Cloth quality ?</label><br>
				           <spr:radiobutton path="Response1" name="Food" value="Very Good"/> <label class="fontify1">Very Good</label><br>
				           <spr:radiobutton path="Response1"  name="Food" value="Good"/> <label class="fontify1">Good</label><br>
				           <spr:radiobutton path="Response1"  name="Food" value="Average"/> <label class="fontify1">Average</label><br>
				           <spr:radiobutton path="Response1"  name="Food" value="poor" /> <label class="fontify1">poor</label><br>
		            </div>
		            </br>
		            <div id="Quetion2" class="mt-2">
				           <label class="fontify">2.Cloth is same as description or not?</label><br>
				           <spr:radiobutton  path="Response2"   name="stuff" value="YES"/> <label class="fontify1">YES</label><br>
				           <spr:radiobutton  path="Response2" name="stuff" value="NO"/> <label class="fontify1">NO</label><br>
				    </div>
					</br>
		            <div id="Quetion3 class="mt-2"">   
				           <label class="fontify">3.Do you want to continue with this Donor ?</label><br>
				           <spr:radiobutton path="Response3" name="YES" value="YES"/> <label class="fontify1">YES</label><br>
				           <spr:radiobutton  path="Response3" name="YES" value="NO" /> <label class="fontify1">NO</label><br>
		            </div>
		            </br>
		            <h4 class="fontify">Overall Rating</h4> 
		            <div class="rating" style="font-size:1px">
		                    
						    <spr:radiobutton path="Overrallrating" id="star5" name="rating" value="5" /><label class = "full" for="star5" title="Awesome - 5 stars"></label>
				
						    <spr:radiobutton path="Overrallrating" id="star4" name="rating" value="4" /><label class = "full" for="star4" title="Pretty good - 4 stars"></label>
						   
						    <spr:radiobutton path="Overrallrating" id="star3" name="rating" value="3" /><label class = "full" for="star3" title="Meh - 3 stars"></label>
						   
						    <spr:radiobutton path="Overrallrating" id="star2" name="rating" value="2" /><label class = "full" for="star2" title="Kinda bad - 2 stars"></label>
						    
						    <spr:radiobutton path="Overrallrating" id="star1" name="rating" value="1" /><label class = "full" for="star1" title="Sucks big time - 1 star"></label>
						    
					</div>
					</br>
		                   
		                   
		             <label class="fontify"></label></br>
		             
			         <div id="Quetion4" class="mt-2">
			          <spr:errors cssStyle="color:red"   path="Comment"/>
		                   <label class="fontify">Remarks..</label><br>
		                    <spr:textarea id="CommentId"  cssStyle="background-color:white;font-size:20px;color:black" path="Comment"  onchange="myFunction()"/>
		                 
		             </div>
		          
                       </br>
				     
				   	<input type="submit" value="submit" onclick="Feedback_response_Cloth.htm"></input>
				   				   
				      
				       
    </spr:form>
                 </br>
     			 <a href="Feedback_Food.htm">Skip</a>		
		
		

		<div class="clear"></div>
        

	</div>
	<div class="footer-w3l">
		<p class="agileinfo"> &copy; 2019 Donation Website. All Rights Reserved | Design by <a href="https://www.facebook.com/">Let's Donate</a></p>
	</div>
	<%} %>
</body>
</html>