<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<form:url var="css" value="/resources/css" />
<form:url var="js" value="/resources/js" />
<form:url var="images" value="/resources/images"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<title>Online Shopping - ${title}</title>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">


<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">
</head>
<body>
 <%@ include file="./shared/header.jsp" %>
   
   
   <%@ include file="./shared/footer.jsp"%>
   
   <script src="${js}/jquery.min.js"></script>
	
	<!--   <script src="${js}/jquery.js"></script>-->
	<!--  --> <script src="${js}/tether.min.js"></script>
	
	<script src="${js}/bootstrap.bundle.min.js"></script>
   
</body>
</html>