package Collections;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;

public class MapCharactersCount {
	public static void main(String args[])
	{
		Map<String, Integer> words = new HashMap<String, Integer>();
		words.put("a", 1);
		
		matchsAndPrint(words);
		
	}
	
	private static void matchsAndPrint(Map<String, Integer> words)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your String : ");
		String s = in.nextLine().toLowerCase();
		String[] c = s.split("");
		for (String items : c)
		{
			if (words.containsKey(items))
			{
				int count = words.get(items);
				words.put(items, count+1);
			}else
			{
				words.put(items, 1);
			}
		}
		
		System.out.println(words);
		
		
	}
		

} // Account
