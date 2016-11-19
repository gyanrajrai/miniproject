<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <form action="createStudent" method="post">
    <P>
    <LABEL for="firstname">First name: </LABEL>
              <INPUT type="text" id="firstName" name="firstName"><BR>
    <LABEL for="lastname">Last name: </LABEL>
              <INPUT type="text" id="lastName" name="lastName"><BR>
    <LABEL for="email">email: </LABEL>
              <INPUT type="text" id="email" name="email"><BR>
    <label> phone</label>
    <input type="text" name="phone"><br>
    <label>facuty</label>
    <input type="text" name="faculty"><br>
    
    <INPUT type="submit" value="Submit"> <INPUT type="reset">
    </P>
 </FORM>

</body>
</html>