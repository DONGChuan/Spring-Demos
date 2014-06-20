<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<head>
		<title>Simple Form Controller</title>
	</head>
	<body>
		<form name="HelloWorld" action="/SpringMVC-SimpleFormController/helloWorld.do" method="post">
		 	Input : <input type="text" name="msg" value=""/><br>
		 	<input type="submit" value="Submit">
		</form>
	</body>
</html>
