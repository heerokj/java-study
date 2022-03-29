package day17;

import java.io.Serializable;

public class Member implements Serializable{
	private String id, pw, name, addrs, email;
	private int age;
	
	// 기본생성자, 매개변수있는 생성자, setter, getter..
	
	public Member(){
		
	}
			 
	public Member(String id, String pw, String name, String addrs, String email, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.addrs = addrs;
		this.email = email;
		this.age = age;
	}



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
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

	
	
	
	

}
