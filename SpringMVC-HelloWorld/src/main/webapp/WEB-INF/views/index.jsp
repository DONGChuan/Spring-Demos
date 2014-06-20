<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
	<head>
		<title>Spring MVC HelloWorld</title>
	</head>
	<body>
		<h1><c:out value="${helloWorld}"></c:out></h1>
	</body>
</html>
