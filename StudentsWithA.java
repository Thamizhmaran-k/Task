package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StudentsWithA {
	public static void main(String args[]) {
		List<String> students = Arrays.asList("Arul", "Bala", "Arikaran", "Arun", "Mani", "Aravinth", "Saran", "Ananth", "John");
		
		List<String> namesStartingWithA = students.stream()
				.filter(name -> name.startsWith("A"))
				.collect(Collectors.toList());
		
		System.out.println("Students whose names start with A: "+namesStartingWithA);
				
	}

}
