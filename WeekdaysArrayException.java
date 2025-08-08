package com.assessment.oops;

import java.util.Scanner;

public class WeekdaysArrayException {
	    public static void main(String args[]) {
	        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	        Scanner scan = new Scanner(System.in);

	        try{
	            System.out.print("Enter day index (0-6): ");
	            int index = scan.nextInt();
	            System.out.println("Day: " + weekdays[index]);
	        }
	        catch(ArrayIndexOutOfBoundsException e) {
	            System.out.println("Invalid index! Please enter a value between 0 and 6.");
	        }
	    }
	}

