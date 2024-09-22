package model;

import db.DBconnection;
import dto.UserDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginAuthenticator {

    public boolean isLogin(UserDTO user) {
        String username = user.getUsername();
        String password = user.getPassword();
        String tablpassword = "";

        try {
            Statement st = DBconnection.getStatement();
            String query = "select password from employees where username = '" + username + "' ";
            System.out.println(query);

            ResultSet rs = st.executeQuery(query);
            if (rs.next()) {
                tablpassword = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }

        if (username != null && password != null && !username.trim().equals("") && password.equals(tablpassword)) {
            return true;
        }
        return false;
    }
}
