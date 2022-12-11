/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import Context.DbContext;
import entity.Course;
import entity.Order;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PHANH
 */
public class OrderDao {

    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    Statement statement = null;

    public List<Order> getListOrderOfUserProfile(Integer userId) {
        List<Order> list = new ArrayList<>();
        String sql = "SELECT * FROM order INNER JOIN user ON user.user_id = order.userid WHERE user_id = " + userId + " ;";
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            Order order = new Order();
            while (rs.next()) {
                Course course = getCourseById(rs.getInt("course_id"));
                User user = getUserById(userId);
                list.add(new Order(course, user));
            }
            con.close();
        } catch (Exception e) {
        }
        return list;
    }

    private Course getCourseById(Integer courseId) {
        Course course = null;
        String sql = "SELECT * FROM course  WHERE course_id = " + courseId + " ;";
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            course = new Course(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
                    rs.getInt(6), rs.getInt(7));
            con.close();
        } catch (Exception e) {
        }
        return course;
    }

    private User getUserById(Integer userId) {
        User user = new User();
        String sql = "SELECT  * FROM  user WHERE user_id = " + userId + " ;";

        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                user.setUser_id(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setEmail(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setPhone(rs.getString(5));
                user.setAddress(rs.getString(6));
                user.setPosition(rs.getString(7));
                user.setCompany(rs.getString(8));
                user.setAvatar(rs.getString(9));
                user.setRole(rs.getString(10));
                user.setGender(rs.getString(11));
                user.setStatus(rs.getString(12));

            }
        } catch (SQLException ex) {
        }
        return user;
    }

    public static void main(String[] args) {
        OrderDao dao = new OrderDao();
        List<Order> list = dao.getListOrderOfUserProfile(1);
        for (Order order : list) {
            System.out.println(order);
        }
    }

    private Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
