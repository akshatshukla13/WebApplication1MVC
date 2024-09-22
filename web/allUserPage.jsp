<%-- 
    Document   : newjspallUserPage
    Created on : Sep 22, 2024, 9:51:05 PM
    Author     : SSC
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.UserDTO2"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AllUsers Page</title>
    </head>
    <body>
        <h1>All Users!</h1>
        <% ArrayList<UserDTO2> users = (ArrayList<UserDTO2>) session.getAttribute("users");
            Iterator it = users.iterator();
        %>


        <table style="border: 2px solid black; width: 50%; text-align: left;">
            <tr >
                <th style="border: 2px solid black;">UserName</th>
                <th style="border: 2px solid black;">Password</th>
                <th style="border: 2px solid black;">Salary</th>
                <th style="border: 2px solid black;">City</th>
            </tr>

            <%     while (it.hasNext()) {
                    UserDTO2 user = (UserDTO2) it.next();
            %> 
            <tr>
                <td style="border: 2px solid black;"><%= user.getUsername()%></td>
                <td style="border: 2px solid black;"><b>********</b></td>
                <td style="border: 2px solid black;"><%= user.getSalary()%></td>
                <td style="border: 2px solid black;"><%= user.getCity()%></td>
            </tr>
            <%
                }
            %>

        </table>


    </body>
</html>
