package LambdasAndStreams;

import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomIntStreamDice {
	
	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();
		
		// roll a dice 6 000 000 times and summarize the results...
		System.out.printf("%-6s%s%n", "Face", "Frequency");
//		random.ints(1000000, 1, 7).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//		.forEach((face, frequency) -> System.out.printf("%-6d%d%n", face, frequency));
		
		random.ints(100, 1, 7).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.forEach((face, numOfOccurencies) -> System.out.printf("%-6d%d%n", face, numOfOccurencies) );
		
		
		
		
	}
	
	

}
