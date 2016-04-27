
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>${game.vtitle}</title>

    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <h1 class="jumbotron">${block.vbody}</h1>
        <c:forEach var="variant" items="${variants}">
            <a class="btn btn-default" href="<c:url value='/game?id=${game.id}&blockid=${variant.getTBlocksByNtoblockid().id}' />">${variant.vbody}</a><br/>
        </c:forEach>
    </body>
</html>
