
<%@ page import="kist.com.servlet.UpdateStudent" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>data fetch from database in form</title>
</head>
<body>
<form action="updatedStudent" method="get">
<label>First Name:</label><input type="text" name="firstname" value="${response.user}"/>
<label>Last Name:</label><input type="text" name="firstname" value="">
<label>email:</label><input type="text" name="firstname" value="">s
<label>Phone</label><input type="text" name="firstname" value="">
<label>faculty</label><input type="text" name="firstname" value="">
<input type="submit" value="send">

</form>

</body>
</html>