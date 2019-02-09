<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="spr" uri="http://www.springframework.org/tags/form"%>
<%@ page errorPage="error.jsp" %>  

<!DOCTYPE html>
<html>
<head>
<title>Let's Donate</title>
<!-- Style-sheets -->
<link rel="stylesheet" href="css/creditly.css">
<link rel="stylesheet" href="css/style123.css">
<!-- //Style-sheets -->
<!-- web-fonts -->
<link href="//fonts.googleapis.com/css?family=Carter+One"
	rel="stylesheet">
<link
	href="//fonts.googleapis.com/css?family=Roboto:300,400,500,700,900"
	rel="stylesheet">
<!-- //web-fonts -->
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1" />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Orphanage Donation Form  Widget Responsive, Login Form Web Template, Flat Pricing Tables, Flat Drop-Downs, Sign-Up Web Templates, Flat Web Templates, Login Sign-up Responsive Web Template, Smartphone Compatible Web Template, Free Web Designs for Nokia, Samsung, LG, Sony Ericsson, Motorola Web Design" />
<script type="application/x-javascript">
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 



</script>
<!-- //Meta tag Keywords -->
</head>
<body>
<%if(session.getAttribute("username")==null) {response.sendRedirect("login.jsp");}else{%>


<div style="height: 30px">
	<%@include file="DonorMasterPage.jsp" %>
</div>
	<h4>Orphanage Donation Form</h4>
	<div class="w3layouts">
		<div class="donate_form_w3l">
			<h5 class="center-w3ls">Donate Now</h5>
			<h2 class="center-w3ls">What would you like to donate?</h2>



			<spr:form action="donorBookRequest.htm" method="post" commandName="donor1">

				<spr:select path="location" class="center-w3ls font-white">

					<spr:option value="Kharghar"></spr:option>
					<spr:option value="Nerul"></spr:option>
					<spr:option value="Seawood"></spr:option>
					<spr:option value="Badlapur"></spr:option>

				</spr:select>




				<div class="left-agileinfo" id="bookdiv">

					<h5>Enter Book details</h5>

					<p>Number of Books</p>
					<spr:input path="quantity" id="" type="number" name="Name" />

					<p>Books Discription</p>
					<spr:input path="description" id=""
						class="form-control abc" rows="5" type="textarea" required=""/>
					<a href="donorBookSkip.htm" class="font-white">Skip</a>

					<div class="clearfix"></div>

					<div id="submit">
						<input type="submit" value="Donate">
					</div>
				</div>





			</spr:form>
		</div>

		<div class="clear"></div>


	</div>
	<div class="footer-w3l">
		<p class="agileinfo">
			&copy; 2017 Orphanage Donation Form . All Rights Reserved | Design by
			<a href="http://w3layouts.com">W3layouts</a>
		</p>
	</div>




	<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
	<!-- creditly -->
	<script type="text/javascript" src="js/creditly.js"></script>
	<script type="text/javascript">
		$(function() {
			var creditly = Creditly.initialize(
					'.creditly-wrapper .expiration-month-and-year',
					'.creditly-wrapper .credit-card-number',
					'.creditly-wrapper .security-code',
					'.creditly-wrapper .card-type');

			$(".creditly-card-form .submit").click(function(e) {
				e.preventDefault();
				var output = creditly.validate();
				if (output) {
					// Your validated credit card output
					console.log(output);
				}
			});
		});
	</script>
	<!--// creditly -->

<%} %>

</body>
</html>