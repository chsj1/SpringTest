package com.hjd.day01;

public class User {
	private int id;
	private String name;
	private String address;
	
	public User() {
		System.out.println("----->����User����");
	}
	
	
	public User(int id, String name, String address) {
		//�����вι��캯��
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public void init_user(){
		System.out.println("---->��������");
	}
	
	public void destroy_user(){
		System.out.println("---->���ٶ���");
	}
}
