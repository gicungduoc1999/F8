/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Course {
    private int course_Id;
    private String course_Name;
    private String price;
    private String des;
    private int cheter_Id;
    private int lesson_Id;
    private int enroll;
    private List<Chapter> chapters;
    private int numberOfChapter;
    private String image;

    public Course() {
    }

    public Course(int course_Id, String course_Name, String price, String des, int cheter_Id, int lesson_Id, int enroll, int numberOfChapter, String image) {
        this.course_Id = course_Id;
        this.course_Name = course_Name;
        this.price = price;
        this.des = des;
        this.cheter_Id = cheter_Id;
        this.lesson_Id = lesson_Id;
        this.enroll = enroll;
        this.numberOfChapter = numberOfChapter;
        this.image = image;
    }

    public Course(int aInt, String string, String string0, String string1, int aInt0, int aInt1, int aInt2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCourse_Id() {
        return course_Id;
    }

    public void setCourse_Id(int course_Id) {
        this.course_Id = course_Id;
    }

    public String getCourse_Name() {
        return course_Name;
    }

    public void setCourse_Name(String course_Name) {
        this.course_Name = course_Name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getCheter_Id() {
        return cheter_Id;
    }

    public void setCheter_Id(int cheter_Id) {
        this.cheter_Id = cheter_Id;
    }

    public int getLesson_Id() {
        return lesson_Id;
    }

    public void setLesson_Id(int lesson_Id) {
        this.lesson_Id = lesson_Id;
    }

    public int getEnroll() {
        return enroll;
    }

    public void setEnroll(int enroll) {
        this.enroll = enroll;
    }
    
    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }

    public int getNumberOfChapter() {
        return numberOfChapter;
    }

    public void setNumberOfChapter(int numberOfChapter) {
        this.numberOfChapter = numberOfChapter;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    @Override
    public String toString() {
        return "Course{" + "course_Id=" + course_Id + ", course_Name=" + course_Name + ", price=" + price + ", des=" + des + ", cheter_Id=" + cheter_Id + ", lesson_Id=" + lesson_Id + ", enroll=" + enroll + '}';
    }
}