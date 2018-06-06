<%-- 
    Document   : lista
    Created on : 05-jun-2018, 20:26:49
    Author     : J Michael
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <title>JSP Page</title>
        <link href="<c:url value="resources/css/styles.css" />" rel="stylesheet" />
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

    </head>
    <body>

        <div class="container">
            <center><h1 class="display-1"><ins>LISTA DETALLE DE ACCESO DE USUARIO</ins></h1></center>
            <p> Número de Registros : <c:url value="${datos.size()}" />  </p>

            <div class="row">
                <table class="table table-bordered table-striped table-hover">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Lastname</th>
                            <th>Email</th>
                            <th>Enterprise</th>
                            <th>Register Date</th>
                            <th>Access Date</th>
                            <th>Access Time</th>
                        </tr>    
                    </thead>
                    <tbody>
                        <c:forEach items="${datos}" var="dato">
                            <tr>
                                <td><c:out value="${dato.name}"/></td>
                                <td><c:out value="${dato.lastName}"/></td>
                                <td><c:out value="${dato.email}"/></td>
                                <td><c:out value="${dato.enterprise}"/></td>
                                <td><c:out value="${dato.registerDate}"/></td>
                                <td><c:out value="${dato.accessDate}"/></td>
                                <td><c:out value="${dato.accessTime}"/></td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
