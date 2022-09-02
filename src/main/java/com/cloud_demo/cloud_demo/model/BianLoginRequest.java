package com.cloud_demo.cloud_demo.model;

public class BianLoginRequest {
	
	private String uname;
	private String pass;
	
	
	
	public BianLoginRequest(String uname, String pass) {
		super();
		this.uname = uname;
		this.pass = pass;
	}
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "BianLoginRequest [uname=" + uname + ", pass=" + pass + "]";
	}
	
	

}
