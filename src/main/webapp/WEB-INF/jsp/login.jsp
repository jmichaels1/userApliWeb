<%-- 
    Document   : home
    Created on : 02-jun-2018, 12:14:15
    Author     : J Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="login" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Página de Acceso</title>
        <link href="<c:url value="resources/css/styles.css" />" rel="stylesheet" />
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        
    </head>
    <body>
        <div class="container">
            <div class="card card-container">
                <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
                <p id="profile-name" class="profile-name-card"></p>
                <login:form class="form-signin" method="post" commandName="user" >
                    
                    <span id="reauth-email" class="reauth-email"></span>
                    
                    <login:errors path="*" element="div" cssClass="alert alert-danger" />
                    
                    <login:input id="email" type="email" cssClass="form-control" placeholder="Email address" path="email" require="required" autofocus="autofocus"></login:input>
                    <login:errors path="email" />
                   
                    <div id="remember" class="checkbox">
                        <label>
                            <input type="checkbox" value="remember-me"> Recordar
                        </label>
                   
                    </div>
                    <login:button type="submit" class="btn btn-lg btn-primary btn-block btn-signins">Entrar</login:button>
       
                </login:form><!-- /form -->
                
                <center>
                     <a href="form.htm">
                    ¿Aún no estás registrado?, <br>Regístrate Gratis Aquí!
                    </a>
                </center>
                
               
            </div><!-- /card-container -->
        </div><!-- /container -->
    </body>
</html>
