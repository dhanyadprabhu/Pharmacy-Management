package com.cognizant.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class ManageUser {
	@Id	
	@Column(name = "id")
private int id;
	@Column(name ="username")
private String userName;
	@Column(name ="password")
private String password;

	public ManageUser() {}

	public ManageUser(int id, String userName, String password) {
		
		this.id = id;
		this.userName = userName;
		this.password = password;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Login [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}

}
