/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ADMIN
 */
public class TraningProgram {
    private int id;
    private String title;
    private String des;
    private String image;

    public TraningProgram() {
    }

    public TraningProgram(int id, String title, String des, String image) {
        this.id = id;
        this.title = title;
        this.des = des;
        this.image = image;
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

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "TraningProgram{" + "id=" + id + ", title=" + title + ", des=" + des + ", image=" + image + '}';
    }
    
    
}
