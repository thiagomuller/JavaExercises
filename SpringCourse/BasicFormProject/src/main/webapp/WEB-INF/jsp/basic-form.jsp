<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Basic-Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="player">
        Player's Name: <form:input path="playerName"/>
        <form:errors path="playerName"/>
        <br><br>
        Player's Age: <form:input path="playerAge"/>
        <form:errors path="playerAge"/>
        <br><br>
        Favorite Console: <form:input path="favoriteConsole"/>
        <form:errors path="favoriteConsole"/>
        <br><br>
        Favorite Game Of All Time: <form:input path="favoriteGame"/>
        <form:errors path="favoriteGame"/>
        <br><br>
        Favorite Exclusive: <form:input path="favoriteExclusive"/>
        <form:errors path="favoriteExclusive"/>
        <br><br>
        <input type="submit" value="Submit"/>
    </form:form>
</body>
</html>