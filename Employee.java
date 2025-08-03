package com.oop;

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
class Employee extends Person {
	int employeeID;
	double salary;

    public Employee(String name, int age, int employeeID, double salary) {
	super(name, age);
	this.employeeID = employeeID;
	this.salary = salary;
}
public void display() {
	System.out.println("Name : " + name);
	System.out.println("Age :"+ age);
	System.out.println("Employee ID : "+ employeeID);
}
}
