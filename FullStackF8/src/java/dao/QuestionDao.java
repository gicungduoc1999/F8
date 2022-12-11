package dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Context.DbContext;
import entity.Question;
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
public class QuestionDao extends DbContext {

    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    public List<Question> getAllQuestion() {
        List<Question> list = new ArrayList<>();
        String sql = "SELECT * FROM question;";
        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            while (rs.next()) {
                list.add(new Question(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
                  
            }
        } catch (Exception e) {
        }
        return list;
    }

    public Question getQuestion(int id) {
        Question qs = null;
        try (Connection conn = getConnection()) {
            String query = "SELECT * FROM swp.question WHERE question_id = ?";
            PreparedStatement stm = conn.prepareStatement(query);
            stm.setInt(1, id);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                qs = new Question(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)
                , rs.getString(5));
                qs.setQuestion_id(rs.getInt(1));
                qs.setCourse_name(rs.getString(2));
                qs.setLesson_name(rs.getString(3));
                qs.setContent(rs.getString(4));
                qs.setExplanation(rs.getString(5));

            }
        } catch (SQLException ex) {
            Logger.getLogger(QuestionDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            return qs;
        }
    }

    public Question getQuestionById(int question_id) {
        Question question = null;
        try {
            PreparedStatement stmt
                    = getConnection().prepareStatement("SELECT * FROM swp.question WHERE question_id = ?");
            stmt.setInt(1, question_id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                question = new Question(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)
                , rs.getString(5));
                question.setQuestion_id(rs.getInt(1));
                question.setCourse_name(rs.getString(2));
                question.setLesson_name(rs.getString(3));
                question.setContent(rs.getString(4));
                question.setExplanation(rs.getString(5));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return question;
    }

    public static void main(String[] args) {
        QuestionDao dao = new QuestionDao();
        List<Question> list = dao.GetQuestionFollowPage(1, "2");
        System.out.println(list);
    }

    public List<Question> GetQuestionFollowPage(int x, String search) {
        List<Question> a = new ArrayList<Question>();
        String sql = "select * from (select ROW_NUMBER() over (order by question_id asc) as r,question_id,course_name, lesson_name,content,explanation from question where course_name like? or lesson_name like ? or content like ? ) as x where r between ?*3-2 and ?*3";

        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setString(1, "%" + search + "%");
            st.setString(2, "%" + search + "%");
            st.setInt(3, x);
            st.setInt(4, x);
            rs = st.executeQuery();
            while (rs.next()) {
                Question question = new Question(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                question.setQuestion_id(rs.getInt(2));
                question.setCourse_name(rs.getString(3));
                question.setLesson_name(rs.getString(4));
                question.setContent(rs.getString(5));
                question.setExplanation(rs.getString(6));
                a.add(question);
            }
        } catch (SQLException ex) {
        }
        return a;
    }

    public List<Question> searchQustion(String search) {
        List<Question> a = new ArrayList<Question>();
        String sql = "select * from question where lesson_id like ? or content like ?";
        try {
            con = getConnection();

            st = con.prepareStatement(sql);
            st.setString(1, "%" + search + "%");
            rs = st.executeQuery();
            while (rs.next()) {
               Question question = new Question(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                question.setQuestion_id(rs.getInt(2));
                question.setCourse_name(rs.getString(3));
                question.setLesson_name(rs.getString(4));
                question.setContent(rs.getString(5));
                question.setExplanation(rs.getString(6));
                a.add(question);
            }
        } catch (SQLException ex) {
        }
        return a;
    }

    public List<Question> GetQuestionFollowPage(int x) {
        List<Question> a = new ArrayList<Question>();
        String sql = "select * from (select ROW_NUMBER() over (order by question_id asc) as r,question_id,lesson_id,content,explanation from question) as x where r between ?*3-2 and ?*3";

        try {
            con = getConnection();
            st = con.prepareStatement(sql);
            st.setInt(1, x);
            st.setInt(2, x);
            rs = st.executeQuery();
            while (rs.next()) {
               Question question = new Question(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                question.setQuestion_id(rs.getInt(2));
                question.setCourse_name(rs.getString(3));
                question.setLesson_name(rs.getString(4));
                question.setContent(rs.getString(5));
                question.setExplanation(rs.getString(6));
                a.add(question);
            }
        } catch (SQLException ex) {
        }
        return a;
    }

}
