package com.example.demo.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User {
     
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
     
    @NotBlank(message = "Name is mandatory")
    private String name;
     
    @NotBlank(message = "Email is mandatory")
    private String email;
    
    private String team;
    private String assignment, assignment2,assignment3,assignment4,assignment5 ;
    
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	public String getAssignment() {
		return assignment;
	}

	public void setAssignment(String assignment) {
		this.assignment = assignment;
	}
	public String getAssignment2() {
		return assignment2;
	}

	public void setAssignment2(String assignment2) {
		this.assignment2 = assignment2;
	}
	public String getAssignment3() {
		return assignment3;
	}

	public void setAssignment3(String assignment3) {
		this.assignment3 = assignment3;
	}
	public String getAssignment4() {
		return assignment4;
	}

	public void setAssignment4(String assignment4) {
		this.assignment4= assignment4;
	}
	public String getAssignment5() {
		return assignment5;
	}

	public void setAssignment5(String assignment5) {
		this.assignment5= assignment5;
	}
}