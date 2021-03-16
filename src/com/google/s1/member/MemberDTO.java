package com.google.s1.member;

public class MemberDTO {

	//모든 멤버변수는 private 
	//변수명과 데이터타입은 컬럼명과 동일
	//getter, setter
	//기본 생성자 1개
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private String mobile;
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
}
