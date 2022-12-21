package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private	String name;
    private String teacher;
    private String subject;
    public User() {
	}
    
    
	public User(String name, String teacher, String subject) {
		super();
		this.name = name;
		this.teacher = teacher;
		this.subject = subject;
	}


	public User(int id, String name, String teacher, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.subject = subject;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
    
    
	
    
}
