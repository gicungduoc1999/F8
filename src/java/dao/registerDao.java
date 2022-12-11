/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Context.DbContext;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author legion
 */
public class registerDao extends DbContext {

    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    public Boolean addUser(String name, String email, String password) {
        User user = null;
        try {
            String sql = "INSERT INTO swp.user (name, email, password, role) values(?, ?, ?, ?)";
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, String.valueOf(name));
            st.setString(2, String.valueOf(email));
            st.setString(3, String.valueOf(password));
            st.setString(4, "user");
            st.executeUpdate();

            return true;
        } catch (Exception ex) {
            try {
                throw ex;
            } catch (Exception ex1) {
                Logger.getLogger(loginDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

        return false;
    }

    public User checkEmail(String email) {
        User user = null;
        try {
            String sql = "SELECT * FROM user where email = ?";
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, email);
            rs = st.executeQuery();
            while (rs.next()) {
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
                        rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12));
                return user;
            };
        } catch (Exception ex) {
            try {
                throw ex;
            } catch (Exception ex1) {
                Logger.getLogger(loginDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }

        return null;
    }
}
