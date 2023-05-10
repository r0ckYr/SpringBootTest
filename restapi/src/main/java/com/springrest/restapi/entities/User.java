package com.springrest.restapi.entities;

public class User {
	private int id;
	private String name;
	private int age;
	private String country;
	public User(int id, String name, int age, String country) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.country = country;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + ", country=" + country + "]";
	}
	
	
}
