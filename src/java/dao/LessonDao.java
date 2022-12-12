/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Context.DbContext;
import entity.Blog;
import entity.Course;
import entity.CourseRequestParam;
import entity.Lesson;
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
public class LessonDao extends DbContext {
    
    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;
    
    public List<Lesson> getAllLesson() {
        List<Lesson> list = new ArrayList<>();
        String sql = "select *from lesson l ";
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                int lesson_id = rs.getInt(1);
                int chapter_id = rs.getInt(2);
                int lesson_note_id = rs.getInt(3);
                String title = rs.getString(4);
                String status= rs.getString(5);
                int type = rs.getInt(5);
                String link_video = rs.getString(6);
                Lesson lesson = new Lesson(lesson_id, chapter_id, lesson_note_id, title, status, type, link_video);
                list.add(lesson);
                
            }
        } catch (Exception e) {
        }
        return list;
    }
    
}
