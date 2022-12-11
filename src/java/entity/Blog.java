/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;



/**
 *
 * @author ADMIN
 */
public class Blog {
    private int id;
    private String title;
    private String content;
    private String comment;
    private int userId;
    private Date time;
    private String excerpt;
    private String image;
    private String status;
    private String category;
    private String tag;

    public Blog() {
    }

    public Blog(int id, String title, String content, String comment, int userId, Date time, String excerpt, String image, String status, String category, String tag) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.comment = comment;
        this.userId = userId;
        this.time = time;
        this.excerpt = excerpt;
        this.image = image;
        this.status = status;
        this.category = category;
        this.tag = tag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(String excerpt) {
        this.excerpt = excerpt;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "Blog{" + "id=" + id + ", title=" + title + ", content=" + content + ", comment=" + comment + ", userId=" + userId + ", time=" + time + ", excerpt=" + excerpt + ", image=" + image + ", status=" + status + ", category=" + category + ", tag=" + tag + '}';
    }
    
    
}
