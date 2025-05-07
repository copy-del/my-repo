package com.smhrd.model;

public class MemberVO {
	
	private String id;
	private String pw;
	private String tel;
	private String address;
	
	public MemberVO(String id, String pw, String tel, String address) {
		this.id = id;
		this.pw = pw;
		this.tel = tel;
		this.address = address;
	}

	public MemberVO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public String getId(){
		return this.id;
	}
	
	public String getTel(){
		return this.tel;
	}
	
	public String getAddress(){
		return this.address;
	}
	
	
	
	
	
	
	
	
	
}