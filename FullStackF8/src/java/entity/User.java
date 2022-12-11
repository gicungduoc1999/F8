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
public class User {
    private int user_id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private String position;
    private String company;
    private String avatar;
    private String password;
    private String role;
    private String gender;
    private String status;

    public User() {
    }

    public User(String name, String email, String phone, String address, String position, String company, String password, String role, String gender, String status) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.position = position;
        this.company = company;
        this.password = password;
        this.role = role;
        this.gender = gender;
        this.status = status;
    }
    

    public User(int user_id, String name, String email, String phone, String address, String position, String company, String password, String role, String gender, String status) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.position = position;
        this.company = company;
        this.password = password;
        this.role = role;
        this.gender = gender;
        this.status = status;
    }
    
    

    public User(int user_id, String name, String email, String phone, String address, String position, String company, String avatar, String password, String role, String gender, String status) {
        this.user_id = user_id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.position = position;
        this.company = company;
        this.avatar = avatar;
        this.password = password;
        this.role = role;
        this.gender = gender;
        this.status = status;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" + "user_id=" + user_id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", address=" + address + ", position=" + position + ", company=" + company + ", avatar=" + avatar + ", password=" + password + ", role=" + role + ", gender=" + gender + ", status=" + status + '}';
    }

   
    
}
