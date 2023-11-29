<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body  style="text-align: center">
<h1>Enter contact details</h1>
		<form action="addContact" method="POST">
		First Name:<input type="text" name="firstName" placeholder=" first name" required><br>
		last name :<input type="text" name="lastName" placeholder=" last name" required><br>
	  phone Number:<input type="text" name="phone_number" placeholder=" enter 10 digit phone number " required><br>
		    email :<input type="text" name="email" placeholder="enter email" required><br>
		<input type="submit" value="Submit"><br><br>
		
		<a href="allContacts">View All Contacts</a>
		</form>
</body>
</html>