package entity;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author PHANH
 */
public class Question {
     private int question_id;
     private String course_name;
     private String lesson_name;
     private String content;
     private String explanation;

    public Question() {
    }

    public Question(int question_id, String course_name, String lesson_name, String content, String explanation) {
        this.question_id = question_id;
        this.course_name = course_name;
        this.lesson_name = lesson_name;
        this.content = content;
        this.explanation = explanation;
    }

   

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getLesson_name() {
        return lesson_name;
    }

    public void setLesson_name(String lesson_name) {
        this.lesson_name = lesson_name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    @Override
    public String toString() {
        return "Question{" + "question_id=" + question_id + ", course_name=" + course_name + ", lesson_name=" + lesson_name + ", content=" + content + ", explanation=" + explanation + '}';
    }

}