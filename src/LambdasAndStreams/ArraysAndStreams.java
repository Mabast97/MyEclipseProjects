package LambdasAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArraysAndStreams {
	public static void main(String[] args) {
		Integer[] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};
		// display original values
		System.out.println("Original Values : "+ Arrays.asList(values));
		
		System.out.println("Sorted values : "+
		Arrays.stream(values).sorted().collect(Collectors.toList()) );
		
		List<Integer> greaterThan4 = Arrays.stream(values).filter(value -> value>4).collect(Collectors.toList());
		System.out.println("Greater than 4 : "+greaterThan4);
		
		System.out.println("Greater than 4 with sorted : "+greaterThan4.stream().filter(val -> val>4).sorted().collect(Collectors.toList()));
		
		System.out.println("Values greater than 4 sorted with streams : " +
						   greaterThan4.stream().sorted().collect(Collectors.toList()));
		
		
	}
	
	
}
