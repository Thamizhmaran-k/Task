package streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class NonEmptyStrings {
	public static void main(String args[]) {
		List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		
		List<String> nonEmptyStrings = listStrings.stream()
				.filter(e -> !e.isEmpty())
				.collect(Collectors.toList());
		
		System.out.println("Non-empty Strings: "+nonEmptyStrings);
	}

}
