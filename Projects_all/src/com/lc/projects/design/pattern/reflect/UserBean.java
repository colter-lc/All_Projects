package com.lc.projects.design.pattern.reflect;

public class UserBean {
	
	public UserBean(){
		System.out.println("实例化UserBean...");
	}
	
	private int id;
	private String name;

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

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", name=" + name + "]";
	}
	
	

}
