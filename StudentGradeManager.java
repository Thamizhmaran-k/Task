package com.assessment.oops;
import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeManager {
	    public static void main(String args[]) {
	        HashMap<String, Integer> studentGrades = new HashMap<>();
	        Scanner scan = new Scanner(System.in);
	        studentGrades.put("Rajesh", 85);
	        studentGrades.put("Saran", 90);
	        studentGrades.put("Balaji", 78);
	        
	        System.out.println("All Students: " + studentGrades);
	        
	        System.out.print("Enter student name to add: ");
	        String nameToAdd = scan.nextLine();
	        System.out.print("Enter grade: ");
	        int grade = scan.nextInt();
	        studentGrades.put(nameToAdd, grade);
	        scan.nextLine();
	        System.out.print("Enter student name to remove: ");
	        String nameToRemove = scan.nextLine();
	        studentGrades.remove(nameToRemove);

	        System.out.print("Enter student name to find grade: ");
	        String nameToFind = scan.nextLine();
	        Integer foundGrade = studentGrades.get(nameToFind);
	        if(foundGrade != null) {
	            System.out.println(nameToFind + "'s Grade: " + foundGrade);
	        } 
	        else{
	            System.out.println("Student not found!");
	        }

	        System.out.println("Updated Students: " + studentGrades);
	    }
	}


