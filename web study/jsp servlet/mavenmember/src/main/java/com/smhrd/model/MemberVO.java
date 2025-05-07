package com.smhrd.model;

public class MemberVO {

	private String id;
	private String pw;
	private String tel;
	private String address;
	
	public MemberVO (String id,String pw,String tel,String address) {
		this.id=id;
		this.pw=pw;
		this.tel=tel;
		this.address=address;
	}
	
	
	public MemberVO (String id, String pw) {
		this.id=id;
		this.pw=pw;
	}
	
	
	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getTel() {
		return tel;
	}
	public String getAddress() {
		return address;
	}
	
}
