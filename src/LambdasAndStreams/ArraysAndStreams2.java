package LambdasAndStreams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {
	public static void main(String[] args) {
		String[] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};
		System.out.println("oroginal : "+Arrays.asList(strings));
		
		System.out.println("in UpperCase : "+
		Arrays.stream(strings).map(String::toUpperCase)  // or  .map(value -> value.toUpperCase())
			  .collect(Collectors.toList()) );
		
		// Strings less than "n" (case insensitive) sorted asceding
		System.out.println("Strings less than \"m\" (case sensitive) sorted asceding :" +
		Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("n") < 0)
			 				  .sorted(String.CASE_INSENSITIVE_ORDER).collect(Collectors.toList()) );
		
		// Strings less than "n" (case insensitive) descending order
		System.out.println("Strings less than \"n\" (case insensitive) descending order : "+
		Arrays.stream(strings).filter(s -> s.compareToIgnoreCase("n") < 0)
							  .sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList()) );
		
		
	}

}
