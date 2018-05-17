package com.ibm.training.model;


import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;




@SuppressWarnings("serial")
@XmlRootElement
public class Login implements Serializable{

	private String id;
	private String name;
	private String password;
	private String role;
	private String ph_no;
	private String email;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getPh_no() {
		return ph_no;
	}
	public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Login(String id, String name, String password, String role, String ph_no, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.role = role;
		this.ph_no = ph_no;
		this.email = email;
	}

	public Login() {}


}