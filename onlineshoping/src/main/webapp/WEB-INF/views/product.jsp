<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<form:url var="css" value="/resources/css" />
<form:url var="js" value="/resources/js" />
<form:url var="images" value="/resources/images" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Online Shopping-${title}</title>

<link href="${css}/bootstrap.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">
	

</head>
<body>

  
   <%@ include file="./shared/header.jsp" %>
    <div class="container">
         
          <div class="row">
        <div class="col-lg-3">
                <!-- including custom category -->
				<h1 class="my-4" style="color:blue;">Online Shopping</h1>
				<%@include file="./shared/category.jsp" %>

			</div>
			<!-- /.col-lg-3 -->

			<div class="col-lg-9">
                <div class="row" id="id1">
                         <div class="col-md-12">
                       <table id="productlisttable" class="table table-striped table-borderd">
                       
                          <thead>
                              <tr>
                                  <th>name</th>
                                  <th>lname</th>
                              </tr>
                          </thead>
                       
                       </table> 
                   
                </div>
           </div>
           <!-- col-lg-9 -->
           
           </div>
           <!-- container -->
           </div>
           <!-- row -->
     </div>
   <%@ include file="./shared/footer.jsp"%>
   
   	<!-- Bootstrap core JavaScript -->
  <script src="${js}/jquery.min.js"></script>
	
	  <script src="${js}/jquery.js"></script>s
	<!--   <script src="${js}/tether.min.js"></script>-->
	
	<script src="${js}/bootstrap.bundle.min.js"></script>
	<script src="${js}/jquery.dataTables.js"></script>
   <script type="text/javascript" src="${js}/myapp.js"></script>
	
</body>
</html>