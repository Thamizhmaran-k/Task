package com.assessment.oops;

class Student {
 private int rollNo;
 private String name;
 private int age;
 private String course;

 public Student(int rollNo, String name, int age, String course) 
         throws AgeNotWithinRangeException, NameNotValidException {
     
     if(age < 15 || age > 21) {
         throw new AgeNotWithinRangeException("Age should be between 15 and 21.");
     }

     
     if(!name.matches("[a-zA-Z ]+")) {
         throw new NameNotValidException("Name contains invalid characters.");
     }

     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.course = course;
 }

 public void displayStudent() {
     System.out.println("Roll No: " + rollNo);
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Course: " + course);
 }
}

