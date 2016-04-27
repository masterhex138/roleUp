<%-- 
    Document   : creategame
    Created on : 26.06.2015, 13:50:22
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <h1 class="jumbotron">Create Game Page</h1>
        <div class="col-xs-6 col-md-4">
            <form method="POST" action="${pageContext.request.contextPath}/creategamesuccess?${_csrf.parameterName}=${_csrf.token}" enctype="multipart/form-data">
                <div class="form-group">
                    <fieldset>
                        <p>
                            Game title
                        </p>
                        <input placeholder="Title here" class="form-control" name="title"  />

                        <p>Game image</p>

                            <input type="file" class="form-control" name="file"  />
                    </fieldset>
                    
                    <input type="submit" class="btn btn-success" name="submit" value="Create" /> 
                    


                </div>
            </form>
        </div>
    </body>
</html>
