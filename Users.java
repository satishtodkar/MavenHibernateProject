package com.codemind.MavenHibernateProject;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name= "user_s") 
public class Users {
	private int seq;
	private String userName;
	private String password;
	private Date createDate;
	private String createUser;
	private Date modifyDate;
	private String modifyUser;
	
	public Users() {
		
	}
	
	@Id
	@Column(name = "SEQ", unique = true, nullable = false)
	public int getSeq() {
		return seq;
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getModifyUser() {
		return modifyUser;
	}

	public void setModifyUser(String modifyUser) {
		this.modifyUser = modifyUser;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

}