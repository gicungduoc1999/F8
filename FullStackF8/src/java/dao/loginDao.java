/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Context.DbContext;
import org.hibernate.validator.constraints.Email;

/**
 *
 * @author Longvh
 */
public class loginDao extends DbContext {
    
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    
    public User getUser(String email, String password) {
        User user = null;
        try {
            String sql = "SELECT * FROM user where email = ? and password = ?";
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, email);
            st.setString(2, password);
            rs = st.executeQuery();
            while (rs.next()) {
                int user_id = rs.getInt(1);
                String name=rs.getString("name");
                String email1 =rs.getString("email");
                String phone=rs.getString("phone");
                String address=rs.getString("address");
                String position=rs.getString("position");
                String company=rs.getString("company");
                String avatar=rs.getString("avatar");
                String password1=rs.getString("password");
                String role=rs.getString("role");
                String gender=rs.getString("gender");
                String status=rs.getString("status");
                
                user = new User(user_id, name, email1, phone, address, position, company, avatar, password1, role, gender, status);
                return user;
            };
        } catch (Exception ex) {
            try {
                throw ex;
            } catch (Exception ex1) {
                Logger.getLogger(loginDao.class
                        .getName()).log(Level.SEVERE, null, ex1);
            }
        }
        
        return null;
    }
    
}
