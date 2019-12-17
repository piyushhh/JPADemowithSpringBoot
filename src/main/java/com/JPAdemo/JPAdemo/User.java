package com.JPAdemo.JPAdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

// We want to make table with same name as this class -- we will use @Entity annotation
// @ID -if we want to make that col primaryKey
// @GeneratedValue -If we dont want to give value to that feild 

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String role;
	
	public User(){};
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRole() {
		return role;
	}
	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
}
