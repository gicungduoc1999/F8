/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Context.DbContext;
import entity.Blog;
import entity.Course;
import entity.CourseRequestParam;
import entity.TraningProgram;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author LongVH
 */
public class CourseDao extends DbContext {

    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    public List<Course> getAllCourse() {
        List<Course> list = new ArrayList<>();
        String sql = "SELECT * FROM course;";
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Course(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7),rs.getInt(8) ,rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Course> getCoursePremium() {
        List<Course> list = new ArrayList<>();
        String sql = "SELECT * FROM swp.course where price > 0;";
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Course(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7),rs.getInt(8) ,rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public List<Course> getCourseFree() {
        List<Course> list = new ArrayList<>();
        String sql = "SELECT * FROM swp.course where price = 0;";
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Course(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getInt(7),rs.getInt(8) ,rs.getString(9)));
            }
        } catch (Exception e) {
        }
        return list;
    }
     public List<TraningProgram> getAllProgram() {
        List<TraningProgram> list = new ArrayList<>();
        String sql = "SELECT * FROM swp.training_program;";
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                list.add(new TraningProgram(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
            }
        } catch (Exception e) {
        }
        return list;
    }
     public List<Blog> getAllBlog() {
        List<Blog> list = new ArrayList<>();
        String sql = "SELECT * FROM swp.blog;";
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Blog(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDate(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    
    public List<Course> getCourse(CourseRequestParam parameter) {
        List<Course> result = new ArrayList<>();
        String sql = "select * from (\n"
                + "SELECT course.course_id ,course.course_name,course.price,course.description,\n"
                + "count(course_chapter.course_id) as chapter, course.disabled FROM swp.course\n"
                + "LEFT JOIN course_chapter ON course.course_id = course_chapter.course_id\n"
                + "group by course.course_id ) temp\n"
                + "where temp.course_name like ?  and disabled = 1\n"
                + "order by " + parameter.orderBy + " " + parameter.orderType + "\n"
                + "limit " + (parameter.index * parameter.pageSize) + "," + parameter.pageSize;
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, "%" + parameter.keyword + "%");
            System.out.println(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                Course course = new Course();
                course.setCourse_Id(rs.getInt("course_id"));
                course.setCourse_Name(rs.getString("course_name"));
                course.setPrice(roundFloat(rs.getFloat("price")));
                course.setDes(rs.getString("description"));
                course.setNumberOfChapter(rs.getInt("chapter"));
                result.add(course);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    private String roundFloat(float a) {

        return a + "";
    }

    public int countCourse(CourseRequestParam parameter) {
        int result = 0;
        String sql = "select COUNT(*) as total from (\n"
                + "SELECT course.course_id ,course.course_name,course.price,course.description,\n"
                + "count(course_chapter.course_id) as chapter , course.disabled FROM course\n"
                + "LEFT JOIN course_chapter ON course.course_id = course_chapter.course_id\n"
                + "where course.disabled = 1\n"
                + "group by course.course_id ) temp\n"
                + "where temp.course_name like ? \n";
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, "%" + parameter.keyword + "%");
            System.out.println(sql);
            rs = st.executeQuery();
            if (rs.next()) {
                result = rs.getInt("total");
            }
        } catch (Exception e) {

        }
        return result;
    }

    public void delete(int id) {
        String sql = "UPDATE course "
                + "SET disabled = 0"
                + " WHERE course_id = ?";
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setInt(1, id);
            st.executeUpdate();
        } catch (Exception e) {

        }
    }

    public Course getById(int id) {
        String sql = "SELECT * FROM Course"
                + " WHERE course_id = ?";

        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            if (rs.next()) {
                Course data = new Course();
                data.setCourse_Id(id);
                data.setCourse_Name(rs.getString("course_name"));
                data.setDes(rs.getString("description"));
                data.setPrice(roundFloat(rs.getFloat("price")));
                return data;
            }
        } catch (Exception e) {

        }
        return null;
    }

    public void update(Course course) throws Exception {
        String sql = "UPDATE  Course"
                + " SET course_name = ?, price = ? ,description = ? "
                + " WHERE course_id = ?";
        con = getConnection();
        st = con.prepareStatement(sql);
        st.setString(1, course.getCourse_Name());
        st.setFloat(2, Float.parseFloat(course.getPrice()));
        st.setString(3, course.getDes());
        st.setInt(4, course.getCourse_Id());
        st.executeUpdate();
    }

    public void add(Course course) {
        String sql = "INSERT INTO Course(course_id,course_name,price,description,disabled) VALUES(?,?,?,?,?)";
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setInt(1, course.getCourse_Id());
            st.setString(2, course.getCourse_Name());
            st.setFloat(3, Float.parseFloat(course.getPrice()));
            st.setString(4, course.getDes());
            st.setInt(5, 1);
            st.executeUpdate();
        } catch (Exception e) {

        }
    }
    
    public static void main(String[] args) {
        CourseDao dao = new CourseDao();
        List<Course> list = dao.getAllCourse();
        for (Course course : list) {
            System.out.println(course);
        }
    }
}