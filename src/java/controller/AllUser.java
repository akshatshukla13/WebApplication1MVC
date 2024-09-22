/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.UserDTO2;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.GetAllUsers;

/**
 *
 * @author SSC
 */
public class AllUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("home.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GetAllUsers gau = new GetAllUsers();
        ArrayList<UserDTO2> users = gau.getAllUser();
        System.out.println("got users " + users);

        HttpSession session = req.getSession(true);
        session.setAttribute("users", users);
        resp.sendRedirect("allUserPage.jsp");
    }

}
