<%-- 
    Document   : logout
    Created on : Sep 19, 2024, 7:11:23 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>logout Page</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("login.html");
        %>
    </body>
</html>
