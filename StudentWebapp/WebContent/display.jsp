<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>

<!--that particular attribute should be available for us in jsp page to display data-->
<!-- instead of using jsp tags and java code, we will use JSTL(java sctrip tag library) to dispay that data here-->

<h2> List of Students</h2>
<table border = 1><tr>
<th>ID</th>
<th>FirstName</th>
<th>LastName</th>
<th>Email</th>
<th>Phone</th>
<th>Faculty</th>
<th>Updated TS</th>
<th>Created TS</th>
<th> <a href="delete.jsp">delete</a>
<th> <a href="update.jsp">update</a>


</tr>

<c:forEach items="${studentList}" var="student">
<tr>
<td>${student.id }</td>
<td>${student.firstName}</td>
<td>${student.lastName}</td>
<td>${student.email}</td>
<td>${student.phone}</td>
<td>${student.faculty}</td>
<td>${student.updatedTs}</td>
<td>${student.createdTs}</td>

</tr>
</c:forEach>
</table>

</body>
</html>