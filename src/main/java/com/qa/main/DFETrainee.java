package com.qa.main;

public class DFETrainee {
	
	public int age;
	public String name;
	
	public DFETrainee(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public DFETrainee(String name, int age) {
		this.age = age;
		this.name = name;
	}
	
	public DFETrainee() {
		this.age = 99;
		this.name = "A Nobody";
	}
	
	@Override
	public String toString() {
		return "DFETrainee [name= " + name + ", age=" + age + "]";
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
