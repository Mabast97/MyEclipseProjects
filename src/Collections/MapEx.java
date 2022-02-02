package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MapEx {
	public static void main(String args[])
	{
		// create HashMap to store String keys and Integer values
		Map<String, Integer> myMap = new HashMap<>();
		myMap.put("First", 1);
		
		createMap(myMap);		
		displayMap(myMap);
	}
	
	private static void createMap(Map<String, Integer> map)
	{
		Scanner scanner = new Scanner(System.in); // create scanner
		System.out.println("Enter a string:"); // prompt for user input
		String input = scanner.nextLine();
		
		// tokenize the input
		String[] tokens = input.split(" ");
		
		// processing input text
		for (String token : tokens)
		{
			String word = token.toLowerCase(); // get lowercase word
			
			// if the map contains the word
			if(map.containsKey(word))
			{
				int count = map.get(word);
				map.put(word, count+1);
			}else { map.put(word, 1); }
		}
	} // createMap()
	
	public static void displayMap(Map<String, Integer> map)
	{
		Set<String> set = map.keySet();
		// sort keys
		TreeSet<String> tree = new TreeSet<>(set);
		
		System.out.printf("%nMap contains:%nKey\t\tValue%n");
		for(String key : tree)
			System.out.printf("%-10s%10s%n", key, map.get(key));
		
		System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty() );
	}
	
	
}
