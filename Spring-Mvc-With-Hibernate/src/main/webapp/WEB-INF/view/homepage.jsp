<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="InsertStudent" method="Post" modelAttribute="insert_attribut">
<h1>Insert Student Record</h1>
   ${cheack7}<br>
 <table>
  <tr>
    <td>ID<br>
        <input type="text" name="s_id">
    </td>
  </tr>
  <tr>
    <td>Name<br>
        <input type="text" name="s_name">
    </td>
  </tr>
  <tr>
     <td>Address<br>
        <input type="text" name="s_address">
    </td>
  </tr>
  <tr>
     <td>Laptop Id<br>
        <input type="text" name="l_id">
    </td>
  </tr>
   <tr>
     <td>Submit<br>
        <input type="submit">
    </td>
  </tr>
</table>
</form:form>
--------------------------------------------------------------------------------------
<form:form action="InsertLaptop" method="Post" modelAttribute="insert_attributs">
<h1>Insert Laptop Record</h1>
   ${cheack8}<br>
 <table>
  <tr>
    <td>ID<br>
        <input type="text" name="l_id">
    </td>
  </tr>
  <tr>
    <td>Name<br>
        <input type="text" name="l_name">
    </td>
  </tr>
   <tr>
     <td>Submit<br>
        <input type="submit">
    </td>
  </tr>
</table>
</form:form>
</body>
</html>