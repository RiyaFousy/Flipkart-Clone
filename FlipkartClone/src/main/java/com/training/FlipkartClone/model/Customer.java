package com.training.FlipkartClone.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
@Id
@Column
@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
@Column
private String user_name;
@Column
private String password;
@Column
private String mobile;
@Column
private String address;
@Column
private String mail;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}

}
