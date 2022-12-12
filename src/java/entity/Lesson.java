/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Admin
 */
public class Lesson {

    private int lesson_id;
    private int chapter_id;
    private int lesson_note_id;
    private String title;
    private String status;
    private int type;
    private String link_video;

    public Lesson() {
    }

    public Lesson(int lesson_id, int chapter_id, int lesson_note_id, String title, String status, int type, String link_video) {
        this.lesson_id = lesson_id;
        this.chapter_id = chapter_id;
        this.lesson_note_id = lesson_note_id;
        this.title = title;
        this.status = status;
        this.type = type;
        this.link_video = link_video;
    }
    
    

    public int getLesson_id() {
        return lesson_id;
    }

    public void setLesson_id(int lesson_id) {
        this.lesson_id = lesson_id;
    }

    public int getChapter_id() {
        return chapter_id;
    }

    public void setChapter_id(int chapter_id) {
        this.chapter_id = chapter_id;
    }

    public int getLesson_note_id() {
        return lesson_note_id;
    }

    public void setLesson_note_id(int lesson_note_id) {
        this.lesson_note_id = lesson_note_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getLink_video() {
        return link_video;
    }

    public void setLink_video(String link_video) {
        this.link_video = link_video;
    }

   

}
