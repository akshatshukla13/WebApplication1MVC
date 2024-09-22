
package dao;

import db.DBconnection;
import dto.UserDTO2;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author SSC
 */
public class UserDAO {
    

    public ArrayList<UserDTO2> getAllUserData() {
        
        ArrayList<UserDTO2> userList = new ArrayList<>();
        
        try {
            Statement st = DBconnection.getStatement();
            String query = "select * from employees";
            System.out.println(query);

            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                UserDTO2 user = new UserDTO2();
                user.setUsername(rs.getString(1));
                user.setPassword(rs.getString(2));
                user.setSalary(rs.getString(3));
                user.setCity(rs.getString(4));
//                System.out.println(user);
                userList.add(user);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return userList;
    }
}
