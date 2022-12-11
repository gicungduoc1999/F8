/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author PHANH
 */
public class Order {
    private Course course;
	private User user;

	public Order() {
	}

	public Order(Course course, User user) {
		this.course = course;
		this.user = user;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Order{" + "course=" + course + ", user=" + user + '}';
	}
}

