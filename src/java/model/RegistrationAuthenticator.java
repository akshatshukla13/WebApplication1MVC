package model;

import db.DBconnection;
import dto.UserDTO2;
import java.sql.SQLException;
import java.sql.Statement;

public class RegistrationAuthenticator {

    public boolean isRegistration(UserDTO2 user) {
        String username = user.getUsername();
        String password = user.getPassword();
        String salary = user.getSalary();
        String city = user.getCity();

        if (username == null || password == null || username.trim().equals("")) {
            return false;
        }

        int i = 0;

        try {
            Statement st = DBconnection.getStatement();

            String query = "insert into employees values('" + username + "','" + password + "','" + salary + "','" + city + "')";
            System.out.println(query);
            i = st.executeUpdate(query);

        } catch (SQLException e) {
            System.out.println(e);
        }

        if (i > 0) {
            return true;
        }
        return false;

    }
}
