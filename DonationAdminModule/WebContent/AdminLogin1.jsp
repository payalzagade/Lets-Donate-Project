<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="spr" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content=" Login form" />
<link href="//fonts.googleapis.com/css?family=Spectral" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link href="css/style1.css" rel='stylesheet' type='text/css' media="all" />
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-12">
				<%@ include file="MasterPage.jsp"%>
			</div>
		</div>
	</div>
	<div class="w3-banner-main">
		<div class="center-container">
			<h1 class="header-w3ls">Login</h1>
			<div class="content-top">
				<div class="content-w3ls">
					<div class="form-w3ls">
						<spr:form action="AdminloginObject.htm" method="post"
							commandName="admin">
							<div class="content-wthree1">
								<div class="grid-w3layouts1">
									<div class="form-inline">
										<div class="form-group">
											<label style="color: white;">Username:</label>
											<spr:input path="userName" name="name" class="form-control"
												id="email" />
										</div>
										<div class="form-group">
											<label style="color: white;">Password:</label>
											<spr:password path="password" class="form-control" id="email" />
										</div>
										<div class="checkbox">
											<label><input type="checkbox" name="">
												Remember me</label>
										</div>
										<button style="font: bold;" type="submit"
											class="btn btn-default">Login</button>
										<a href="forgot.html">Forgot PassWord</a>
									</div>
								</div>
							</div>
						</spr:form>

					</div>
				</div>
			</div>
			<div class="form-w3ls-1"></div>
			<div class="clear"></div>
		</div>
	</div>
	<div class="container-fluid">
		<div class="row">
			<div class="col-12 beutify">
				<p class="copyright">
					© CharityPlus 2019<a href="www.cdac.com" target="_blank">CharityPlus</a>
				</p>
			</div>
		</div>
	</div>
	</div>
	</div>

</body>
</html>