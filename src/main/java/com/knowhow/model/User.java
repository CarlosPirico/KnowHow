package com.knowhow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private Integer ra;
	private String name;
	private String password;
	private Integer courseId;
	
    public User() {}

    public User(String name, String password, Integer ra, Integer courseId) {
	    this.name = name;
	    this.ra = ra;
		this.password = password;
	    this.courseId = courseId;
    }
    

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCourseId() {
        return courseId;
    }
    
    public Integer getRa() {
        return ra;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
    	this.password = password;
    }
}

