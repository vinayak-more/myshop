package com.db.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Db_User {
	
	@Id
	@GeneratedValue
	@Column(name="rid")
	private int rid;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="user_type")
	private String userType;
	
	@Column(name="user_creation_date")
	private Timestamp userCreationDate;
	
	@Column(name="user_last_logging_date")
	private Timestamp userLastLoggingDate;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public Timestamp getUserCreationDate() {
		return userCreationDate;
	}

	public void setUserCreationDate(Timestamp userCreationDate) {
		this.userCreationDate = userCreationDate;
	}

	public Timestamp getUserLastLoggingDate() {
		return userLastLoggingDate;
	}

	public void setUserLastLoggingDate(Timestamp userLastLoggingDate) {
		this.userLastLoggingDate = userLastLoggingDate;
	}

}
