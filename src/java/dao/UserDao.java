/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Context.DbContext;
import entity.User;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PHANH
 */
public class UserDao extends DbContext {

    private Connection con;
    private PreparedStatement st;
    private ResultSet rs;

     public String getPassword(String email) {
        try {
            PreparedStatement stmt
                    = getConnection().prepareStatement("SELECT password FROM user WHERE username = ?");
            stmt.setString(1, email);
            ResultSet result = stmt.executeQuery();
            if (result.next()) {
                return result.getString("email");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void changePassword(String pass, int id) {
        try {
            PreparedStatement stmt = getConnection().prepareStatement("update user set password = ? where user_id = ?");
            stmt.setString(1, pass);
            stmt.setInt(2, id);
            stmt.execute();
        } catch (Exception e) {
        }
    }

    public User getUser(String email) {
        User user = null;
        try {
            PreparedStatement stmt
                    = getConnection().prepareStatement("SELECT * FROM user WHERE email = ?");
            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setUser_id(rs.getInt("user_id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
                user.setPosition(rs.getString("position"));
                user.setCompany(rs.getString("company"));
                user.setAvatar(rs.getString("avatar"));
                user.setPassword(rs.getString("password"));
                user.setRole(rs.getString("role"));
                user.setGender(rs.getString("gender"));
                user.setStatus(rs.getString("status"));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    public User getUserById(int id) {
        User user = null;
        try {
            PreparedStatement stmt
                    = getConnection().prepareStatement("SELECT * FROM user WHERE user_id = ?");
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setUser_id(rs.getInt("user_id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                user.setPhone(rs.getString("phone"));
                user.setAddress(rs.getString("address"));
                user.setPosition(rs.getString("position"));
                user.setCompany(rs.getString("company"));
                user.setAvatar(rs.getString("avatar"));
                user.setPassword(rs.getString("password"));
                user.setRole(rs.getString("role"));
                user.setGender(rs.getString("gender"));
                user.setStatus(rs.getString("status"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return user;
    }

    public boolean updateUser(String name, String phone, String address, String position, String company, int uid, String email) {
        try {
            PreparedStatement stmt = getConnection().prepareStatement("Update user set name=?, phone = ?, address=?, position=?, company=? where user_id = ?");
            stmt.setString(1, name);
            stmt.setString(2, phone);
            stmt.setString(3, address);
            stmt.setString(4, position);
            stmt.setString(5, company);
            stmt.setInt(6, uid);
            stmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
     
    

    public List<User> GetUserFollowPage(int x) {
        List<User> a = new ArrayList<User>();

        String sql = "select * from (select ROW_NUMBER() over (order by user_id asc) as r,user_id,name,email,password,phone,address,position,company,avatar\n"
                + ",role,gender,status from user) as x where r between ?*3-2 and ?*3";

        try {
            con = getConnection();
            st = con.prepareStatement(sql);

            st.setInt(1, x);
            st.setInt(2, x);
            rs = st.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setUser_id(rs.getInt(2));
                user.setName(rs.getString(3));
                user.setEmail(rs.getString(4));
                user.setPassword(rs.getString(5));
                user.setPhone(rs.getString(6));
                user.setAddress(rs.getString(7));
                user.setPosition(rs.getString(8));
                user.setCompany(rs.getString(9));
                user.setAvatar(rs.getString(10));
                user.setRole(rs.getString(11));
                user.setGender(rs.getString(12));
                user.setStatus(rs.getString(13));
                a.add(user);

            }
        } catch (SQLException ex) {
        }
        return a;
    }

    public List<User> GetAllUser() throws SQLException {
        List<User> a = new ArrayList<User>();
        String sql = "select * from user ";
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                User user = new User();
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
                a.add(user);

            }
        } catch (SQLException ex) {
        }
        return a;
    }

    public List<User> SearchEmployees(String search, int id) throws SQLException {
        List<User> a = new ArrayList<User>();
        String sql = "";
        if (id == 1) {
            sql = "select * from user where name like ?";
        } else if (id == 2) {
            sql = "select * from user where email like ?";
        } else {
            sql = "select * from user where phone like ?";
        }
        try {
            con = getConnection();

            st = con.prepareStatement(sql);
            st.setString(1, "%" + search + "%");
            rs = st.executeQuery();
            while (rs.next()) {
                User user = new User();
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
                a.add(user);
            }
        } catch (SQLException ex) {
        }
        return a;
    }

    public List<User> SearchEmployeeInPage(int x, int id, String search) throws SQLException {
        List<User> a = new ArrayList<User>();
        String sql = "";
        if (id == 1) {
            sql = "select * from (select ROW_NUMBER() over (order by user_id asc) as r,user_id,name,email,password,phone,address,position,company,avatar\n"
                    + ",role,gender,status from user where name like ?) as x where r between ?*3-2 and ?*3";
        } else if (id == 2) {
            sql = "select * from (select ROW_NUMBER() over (order by user_id asc) as r,user_id,name,email,password,phone,address,position,company,avatar\n"
                    + ",role,gender,status from user where email like ?) as x where r between ?*3-2 and ?*3";
        } else {
            sql = "select * from (select ROW_NUMBER() over (order by user_id asc) as r,user_id,name,email,password,phone,address,position,company,avatar\n"
                    + ",role,gender,status from user where phone like ?) as x where r between ?*3-2 and ?*3";
        }
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, "%" + search + "%");
            st.setInt(2, x);
            st.setInt(3, x);
            rs = st.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setUser_id(rs.getInt(2));
                user.setName(rs.getString(3));
                user.setEmail(rs.getString(4));
                user.setPassword(rs.getString(5));
                user.setPhone(rs.getString(6));
                user.setAddress(rs.getString(7));
                user.setPosition(rs.getString(8));
                user.setCompany(rs.getString(9));
                user.setAvatar(rs.getString(10));
                user.setRole(rs.getString(11));
                user.setGender(rs.getString(12));
                user.setStatus(rs.getString(13));
                a.add(user);
            }
        } catch (SQLException ex) {
        }
        return a;
    }

    public User getUsetById(int x) {
        User user = new User();
        String sql = "select * from user where user_id = ? ";

        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setInt(1, x);
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

    public void updateUser(User user) {
        String sql = "UPDATE user SET name=?, email =?, password=?, phone=?, address=?, position=?, company=?, role=?, gender=?,status=? WHERE user_id = ? ";
        int n = 0;
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, user.getName());
            st.setString(2, user.getEmail());
            st.setString(3, user.getPassword());
            st.setString(4, user.getPhone());
            st.setString(5, user.getAddress());
            st.setString(6, user.getPosition());
            st.setString(7, user.getCompany());
            st.setString(8, user.getRole());
            st.setString(9, user.getGender());
            st.setString(10, user.getStatus());
            st.setInt(11, user.getUser_id());
            n = st.executeUpdate();
        } catch (SQLException ex) {
        }
    }

    public int addUser(User user) {
        int n = 0;
        String sql = "INSERT INTO user\n"
                + "(name,\n"
                + "email,\n"
                + "password,\n"
                + "phone,\n"
                + "address,\n"
                + "position,\n"
                + "company,\n"
                + "avatar,\n"
                + "role,\n"
                + "gender,\n"
                + "status)\n"
                + "VALUES(?,?,?,?,?,?,?,null,?,?,?)";
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, user.getName());
            st.setString(2, user.getEmail());
            st.setString(3, user.getPassword());
            st.setString(4, user.getPhone());
            st.setString(5, user.getAddress());
            st.setString(6, user.getPosition());
            st.setString(7, user.getCompany());
            st.setString(8, user.getRole());
            st.setString(9, user.getGender());
            st.setString(10, user.getStatus());
            n = st.executeUpdate();
        } catch (SQLException ex) {
        }

        return n;
    }

    public User checkExistEmail(String email) throws SQLException {
        User user = null;
        String sql = "SELECT * FROM user WHERE email = ?";
        try {
            con = getConnection();

            st = con.prepareStatement(sql);
            st.setString(1, email);
            rs = st.executeQuery();
            while (rs.next()) {
                User user1 = new User();
                user1.setUser_id(rs.getInt(1));
                user1.setName(rs.getString(2));
                user1.setEmail(rs.getString(3));
                user1.setPassword(rs.getString(4));
                user1.setPhone(rs.getString(5));
                user1.setAddress(rs.getString(6));
                user1.setPosition(rs.getString(7));
                user1.setCompany(rs.getString(8));
                user1.setAvatar(rs.getString(9));
                user1.setRole(rs.getString(10));
                user1.setGender(rs.getString(11));
                user1.setStatus(rs.getString(12));
                user = user1;
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return user;
    }

    public void deleteUserById(int uid) throws SQLException {
        String sql = "delete from user where user_id = ?";
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setInt(1, uid);
            st.executeUpdate();

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public User verifyCode(String email, boolean b, String code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updateUserStatus(int i, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean checkEmail(String email) throws SQLException {
        String sql = "SELECT * FROM user WHERE email = ?";
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, email);
            rs = st.executeQuery();

        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public Object getUserByEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
//   public User getUserByEmail(String email) {
//        String query = = "SELECT [userId],[userName],[email],[password],[avatar],"
//                + "[gender],[dob],[roleId],[status],[code] FROM [USER] WHERE EMAIL = ?";
//        try {
//            
//            con = getConnection();
//            st = con.prepareStatement(query);
//            st.setString(1, email);
//            rs = st.executeQuery();
//            while (rs.next()) {
//                return new User(rs.getInt(1), rs.getString(2), rs.getString(3),
//                        rs.getString(4), rs.getString(5), rs.getBoolean(6),
//                        rs.getDate(7), rs.getInt(8),
//                        rs.getInt(9), rs.getString(10));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
 



