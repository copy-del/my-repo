package com.smhrd.model;

// VO(Value Object) 구조 : 필드, 메소드(생성자, getter, setter)
public class MavenMember {
	private String id;
	private String pw;
	private String name;
	
	public MavenMember(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}	
	
	public MavenMember(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	

	
	
	
	// 특정 필드값을 가지고 오고 싶을 때
	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	

	
	
	
	
}
