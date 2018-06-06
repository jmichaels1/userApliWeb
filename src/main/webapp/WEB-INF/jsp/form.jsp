<%-- 
    Document   : form
    Created on : 03-jun-2018, 5:14:54
    Author     : J Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="<c:url value="resources/css/styles.css" />" rel="stylesheet" />
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="well well-sm">
                        <form:form class="form-horizontal" method="post" commandName="user" >
                            <fieldset>
                                <legend class="text-center header">Formulario de Usuario</legend>
 
                                <form:errors path="*" element="div" cssClass="alert alert-danger" />
                        
                                <div class="form-group">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                                    <div class="col-md-8">
                                        <form:input id="name" path="name" name="name" type="text" placeholder="Nombre" class="form-control"/>
                                        <form:errors path="name" />
                                    </div>
                                </div>
                                <div class="form-group">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-user bigicon"></i></span>
                                    <div class="col-md-8">
                                        <form:input id="lastname" path="lastname" name="lastname" type="text" placeholder="Apellido" class="form-control"/>
                                        <form:errors path="lastname" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-envelope-o bigicon"></i></span>
                                    <div class="col-md-8">
                                        <form:input id="email" path="email" name="email" type="text" placeholder="Email" class="form-control"/>
                                        <form:errors path="email" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
                                    <div class="col-md-8">
                                        <form:input id="enterprise" path="enterprise" name="enterprise" type="text" placeholder="Empresa" class="form-control"/>
                                        <form:errors path="enterprise" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <span class="col-md-1 col-md-offset-2 text-center"><i class="fa fa-phone-square bigicon"></i></span>
                                    <div class="col-md-8">
                                        <form:input id="registerdate" path="registerdate" name="registerdate" value="${dateValue}" type="text" placeholder="register date" class="form-control" readonly="true" />
                                        <form:errors path="registerdate" />
                                    </div>
                                </div>

                                <div class="form-group">
                                    <div class="col-md-12 text-center">
                                        <form:button type="submit" class="btn btn-primary btn-lg">Guardar Registro</form:button>
                                    </div>
                                </div>
                            </fieldset>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
