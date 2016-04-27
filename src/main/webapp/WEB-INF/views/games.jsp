
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Games Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <h1 class="jumbotron">Games Page</h1>
        <h2>List of Games:</h2>
        
        <c:forEach var="game" items="${games}">
            <a href="<c:url value='/game?id=${game.id}' />">${game.vtitle}</a><br/>
        </c:forEach>
    </body>
</html>
