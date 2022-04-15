<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Axis2 Web Service Client</title>
</head>
<h2>Axis2 WS Client Example</h2>
<body>
	<form action="/Axis2Client/WSClient" method="get">
		File name: <input type="text" name="fname">
		<input type="submit" value="Submit">
	</form>
<%
	String fileContent = (String) request.getParameter("fcontent");
	if(fileContent != null){
		out.print("<br>" + request.getAttribute("fname") + 
				"&nbsp;file content:<br><textarea rows=\"10\" cols=\"70\">" +
		fileContent + "</textarea>");
	}
%>
</body>
</html>