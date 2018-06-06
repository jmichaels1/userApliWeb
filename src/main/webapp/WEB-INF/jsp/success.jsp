<%-- 
    Document   : success
    Created on : 03-jun-2018, 6:24:52
    Author     : J Michael
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>register success</title>
        <link href="<c:url value="resources/css/styles.css" />" rel="stylesheet" />
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    </head>
    <body>
        <div class="container">
            <div class="card card-container">
                <h1>¡¡ Registro con éxito !! </h1>
                <span id="reauth-email" class="reauth-email"></span>
                <br>
                <ul>
                    <li>
                        ¡Enhorabuena <c:out value="${nom}"/>!, tu cuenta ha sido registrada con el email : <c:out value="${email}"/>
                    </li>
                    <span id="reauth-email" class="reauth-email"></span>
                    <br>
                    <br>
                    <input type="button"  class="btn btn-primary btn-lg" onclick="location.href='lista.htm'" value="Ir a la Página Principal" >
                </ul>
            </div>
        </div>
    </body>
</html>
