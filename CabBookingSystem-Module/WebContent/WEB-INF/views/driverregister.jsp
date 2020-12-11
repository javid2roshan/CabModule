<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Driver_Registeration</title>
</head>
<body>
 <div align="center">
  <h1>Driver Register Form</h1>
  <form action="<%= request.getContextPath() %>/register" method="post">
   <table style="with: 80%">
    <tr>
     <td>Name</td>
     <td><input type="text" name="name" /></td>
    </tr>
    <tr>
     <td>Email</td>
     <td><input type="text" name="email" /></td>
    </tr>
    <tr>
     <td>Phone No</td>
     <td><input type="text" name="phoneNo" /></td>
    </tr>
    <tr>
     <td>License No</td>
     <td><input type="text" name="licenseNo" /></td>
    </tr>
      <tr>
     <td>Car No</td>
     <td><input type="text" name="carNo" /></td>
    </tr>
   </table>
   <input type="submit" value="Submit" />
  </form>
 </div>
</body>
</html>