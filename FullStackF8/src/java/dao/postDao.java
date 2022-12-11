/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Context.DbContext;
import entity.Post;
import entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author legion
 */
public class postDao extends DbContext {

    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    Statement statement = null;

    public Post getPostDetail(int id) {
        Post post = null;
        try {
            String sql = "SELECT * FROM blog where blogid = ?";
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            while (rs.next()) {
                post = new Post(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDate(6), rs.getString(7),
                        rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
                return post;
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

    public List<Post> viewAllPost(int offset, int noOfRecords, String dataSearch) {
        
        String sql = "select * from blog where title like ? or category like ? or tags like ? limit ?,?";
        List<Post> list = new ArrayList<Post>();
        Post post = null;
        try {
            
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, "%" +dataSearch + "%");
            st.setString(2, "%" +dataSearch + "%");
            st.setString(3, "%" +dataSearch + "%");
            st.setInt(4, offset);
            st.setInt(5, noOfRecords);
            rs = st.executeQuery();
            while (rs.next()) {
                post = new Post();
                post.setBlogId(rs.getInt(1));
                post.setTitle(rs.getString(2));
                post.setContent(rs.getString(3));
                post.setComment(rs.getString(4));
                post.setUserId(rs.getInt(5));
                post.setTime(rs.getDate(6));
                post.setExcerpt(rs.getString(7));
                post.setImg(rs.getString(8));
                post.setStatus(rs.getString(9));
                post.setCategory(rs.getString(10));
                post.setTags(rs.getString(10));
                list.add(post);
            }

        } catch (Exception ex) {
            try {
                throw ex;
            } catch (Exception ex1) {
                Logger.getLogger(loginDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        return list;
    }

    public List<Post> getRecord() {
        String sql = "select * from blog";
        List<Post> list = new ArrayList<>();
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Post post = new Post();
                post.setBlogId(rs.getInt(1));
                post.setTitle(rs.getString(2));
                post.setContent(rs.getString(3));
                post.setComment(rs.getString(4));
                post.setUserId(rs.getInt(5));
                post.setTime(rs.getDate(6));
                post.setExcerpt(rs.getString(7));
                post.setImg(rs.getString(8));
                post.setStatus(rs.getString(9));
                post.setCategory(rs.getString(10));
                post.setTags(rs.getString(10));
                list.add(post);
            }

            rs.close();

        } catch (Exception ex) {
            try {
                throw ex;
            } catch (Exception ex1) {
                Logger.getLogger(loginDao.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        return list;
    }
    
    public Boolean addPost(String title, String excerpt, String category, String tags,String content,  String comment 
    , int userId, String status) {
        User user = null;
        try {
            String sql = "insert into blog(title, content, comment, user_id, excerpt, img, status, category, tags) values (?, ?, ?, ?, ?, ?, ?, ?)";
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, title);
            st.setString(2, content);
            st.setString(3, comment);
            st.setInt(4, userId);
            st.setString(5, excerpt);
            st.setString(6, status);
            st.setString(7, category);
            st.setString(8, tags);
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
    
    public Boolean updatePost(int id,String title, String excerpt, String category, String tags,String content,  String comment 
    , int userId, String status) {
        User user = null;
        try {
            String sql = "UPDATE blog SET title = ?, content = ?, comment = ?, user_id = ?, excerpt =?, status = ?, category = ?, tags = ? WHERE blogid = ?";
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setInt(1, id);
            st.setString(1, title);
            st.setString(2, content);
            st.setString(3, comment);
            st.setInt(4, userId);
            st.setString(5, excerpt);
            st.setString(6, status);
            st.setString(7, category);
            st.setString(8, tags);
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
    
    public Boolean deletePost(int id) {
        User user = null;
        try {
            String sql = "DELETE FROM blog WHERE blogid = ?";
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setInt(1, id);
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
}
