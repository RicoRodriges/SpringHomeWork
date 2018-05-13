<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
    <p>Prew: <c:out value="${prew}"/></p>
    <p>Current: <c:out value="${current}"/></p>
    <p>Our last changes: <c:out value="${last}"/></p>
    <p><a href="/">Go back</a></p>
</body>
</html>
