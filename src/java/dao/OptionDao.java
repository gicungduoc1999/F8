/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Context.DbContext;
import entity.Lesson;
import entity.Option;
import entity.Question;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PHANH
 */
public class OptionDao extends DbContext {

    Connection con = null;
    PreparedStatement st = null;
    ResultSet rs = null;

    public int addOption(Option option) {
        String sql = "INSERT INTO swp.`option`\n"
                + "(question_id, content, isCorrect)\n"
                + "VALUES(?, ?, ?);";

        int id = -1;
        try {
            con = getConnection();
            st = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            st.setInt(1, option.getQuestion_id());
            st.setString(2, option.getContent());
            st.setBoolean(3, option.isIsCorrect());

            st.executeUpdate();

            //get id
            ResultSet generatedKeys = st.getGeneratedKeys();
            if (generatedKeys.next()) {
                id = generatedKeys.getInt(1);
            } else {
                throw new Exception("Creating option failed, no ID obtained.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return id;
    }

}
