/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.UserDAO;
import dto.UserDTO2;
import java.util.ArrayList;

/**
 *
 * @author SSC
 */
public class GetAllUsers {

    public ArrayList<UserDTO2> getAllUser() {
        UserDAO dao = new UserDAO();
        ArrayList<UserDTO2> users = dao.getAllUserData();

        return users;
    }
}
