package com.ms.producer.entities;



public class Student {

	private String id;
	private String name;
	private Integer roll;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public Student(String id, String name, Integer roll) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", roll=" + roll + "]";
	}
	
	
}
