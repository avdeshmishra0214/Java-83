<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>account create</title>
</head>
<body>
	<jsp:useBean id="acc" class="co.edureka.web.Account"></jsp:useBean>
	<jsp:setProperty property="*" name="acc" />
	<h2>
		A/C No:	<jsp:getProperty property="acno" name="acc" />
		<br> A/C Holder Name: <jsp:getProperty property="acname" name="acc" />
		<br> Balance: <jsp:getProperty property="balance" name="acc" />
		<hr>
	</h2>
</body>
</html>