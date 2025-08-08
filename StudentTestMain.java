package com.assessment.oops;

public class StudentTestMain {
	    public static void main(String[] args) {
	        try{
	            Student s1 = new Student(101, "Rajesh", 20, "B.Sc Computer Science");
	            s1.displayStudent();

	            Student s2 = new Student(102, "Ravi", 22, "B.Com"); // Invalid name and age
	        } 
	        catch(AgeNotWithinRangeException | NameNotValidException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


