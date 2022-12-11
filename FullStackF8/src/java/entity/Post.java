/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author legion
 */
public class Post {

    private int blogId;
    private String title;
    private String content;
    private String comment;
    private int userId;
    private Date time;
    private String excerpt;
    private String img;
    private String status;
    private String category;
    private String tags;
    

    public Post() {
    }

    public Post(int blogId, String title, String content, String comment, int userId, Date time, String excerpt, String img, String status, String category, String tags) {
        this.blogId = blogId;
        this.title = title;
        this.content = content;
        this.comment = comment;
        this.userId = userId;
        this.time = time;
        this.excerpt = excerpt;
        this.img = img;
        this.status = status;
        this.category = category;
        this.tags = tags;
    }
    

    public int getBlogId() {
        return blogId;
    }

    public void setBlogId(int blogId) {
        this.blogId = blogId;
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
    
    

}
