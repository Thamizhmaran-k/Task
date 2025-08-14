package streamapi;

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {
	    public static void main(String args[]) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter your birthdate (yyyy-mm-dd): ");
	        String birthInput = scan.nextLine();
	        LocalDate birthDate = LocalDate.parse(birthInput);
	        LocalDate currentDate = LocalDate.of(2023, 9, 28);
	        
	        int years = currentDate.getYear() - birthDate.getYear();
	        int months = currentDate.getMonthValue() - birthDate.getMonthValue();
	        int days = currentDate.getDayOfMonth() - birthDate.getDayOfMonth();

	        if(days < 0) {
	            months--;
	            days += birthDate.plusMonths(months + years * 12).lengthOfMonth();
	        }
	        if(months < 0) {
	            years--;
	            months += 12;
	        }
	        System.out.printf("Your age is: %d years, %d months, and %d days.%n",
	                years, months, days);

	        scan.close();
	    }
	}

