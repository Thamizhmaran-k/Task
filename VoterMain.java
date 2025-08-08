package com.assessment.oops;

public class VoterMain {
	    public static void main(String args[]) {
	        try{
	            Voter v1 = new Voter(101, "Saran", 20);
	            v1.display();

	            Voter v2 = new Voter(102, "Harish", 16);
	        } 
	        catch(InvalidVoterAgeException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


