<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Baltic International Bank</title>
</head>
<body>

	<div class="container">
		<%@ include file="header.jsp" %>
		
		<div class="row">
			<div class="col-xl-12 col-lg-12 col-md-12 col-sm-12 col-12">
				<div class="jumbotron">
					<h1 class="display-4">BIB</h1>
					<p class="lead">
					Baltic International Bank
					</p>
					
					<a href="user/login" class="btn btn-lg btn-success">Login Here</a>	
				</div>
			</div>
		</div>
		
		
	</div>
		
		<%@ include file="footer.jsp" %>	

</body>
</html>