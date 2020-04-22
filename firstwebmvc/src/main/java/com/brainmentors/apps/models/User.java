package com.brainmentors.apps.models;

public class User {
	private String userid;
	private String pwd;
	public User(){
		
	}
	public User(String userid, String pwd) {
		this.userid = userid;
		this.pwd = pwd;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
