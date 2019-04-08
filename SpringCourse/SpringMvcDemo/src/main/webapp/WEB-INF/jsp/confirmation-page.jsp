<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Confirmation page</title>
</head>
<body>
    The Student is confirmed: ${student.firstName} ${student.lastName}
    <br>
    From: ${student.country}
    <br>
    Favorite Programming Language: ${student.favoriteLanguage}
    <br>
    Favorite Operating Systems:
    <ul>
        <c:forEach var="temp" items="${student.operatingSystems}">
            <li>${temp}</li>
        </c:forEach>
    </ul>
</body>
</html>