package controller;

import dto.UserDTO2;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RegistrationAuthenticator;

public class RegistrationChecker extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("registration.html");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String salary = request.getParameter("salary");
        String city = request.getParameter("city");

        UserDTO2 user = new UserDTO2();
        user.setUsername(username);
        user.setPassword(password);
        user.setSalary(salary);
        user.setCity(city);

        RegistrationAuthenticator ra = new RegistrationAuthenticator();
        boolean register = ra.isRegistration(user);

        if (register) {
            response.sendRedirect("login.html");
            return;
        }

        response.sendRedirect("registration.html");

    }
}
