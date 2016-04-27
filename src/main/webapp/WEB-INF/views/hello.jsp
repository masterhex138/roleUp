<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Games Project</title>
    </head>
    <body>
        <%@ include file="header.jsp" %>

        <h1 class="jumbotron">Hello brother!</h1>
        <div class="container">
            <h1><a class="btn btn-default" href="<c:url value='/games' />">Play Game</a></h1>
            <h1><a class="btn btn-default" href="<c:url value='/creategame' />">Create Game</a></h1>
        </div>
    </body>
</html>