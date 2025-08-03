package com.oop;

public class PersonwithProperties {
	String name;
	int age;
	
	public PersonwithProperties(String name) {
		this.name = name;
		this.age = 18;
	}
	
	public PersonwithProperties(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name : " +name+"Age : " +age);
		
		
	}
}
