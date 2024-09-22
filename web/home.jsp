

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Home Page</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f0f0f0;
                margin: 0;
                padding: 0;
                display: flex;
                justify-content: center;
                align-items: center;
                height: 100vh;
            }

            .container {
                background-color: #fff;
                padding: 30px;
                border-radius: 10px;
                box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
                text-align: center;
                max-width: 400px;
                width: 100%;
            }

            h1 {
                color: #333;
                margin-bottom: 20px;
            }

            h2 {
                color: #555;
                margin-bottom: 30px;
            }

            button {
                background-color: #4CAF50;
                color: white;
                border: none;
                padding: 10px 20px;
                border-radius: 5px;
                font-size: 16px;
                cursor: pointer;
            }

            button:hover {
                background-color: #45a049;
            }

            .signout-btn {
                margin-bottom: 20px;
            }

            input[type="submit"] {
                padding: 10px 20px;
                background-color: #2196F3;
                color: white;
                border: none;
                border-radius: 5px;
                font-size: 16px;
                cursor: pointer;
            }

            input[type="submit"]:hover {
                background-color: #0b7dda;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <%
                String username = (String) session.getAttribute("username");
                if (username == null || username.trim().equals("")) {
                    response.sendRedirect("login.html");
                }
            %>
            <a href="logout.jsp">
                <button class="signout-btn" type="submit">Sign Out</button>
            </a>
            <h1>Welcome, <%= username%>!</h1>
            <h2>Login Successful</h2>

            <form action="AllUser" method="post">
                <input type="submit" value="See All Users" />
            </form>
        </div>
    </body>
</html>
