package Collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SetsEx {
		public static void main(String[] args)
		{
			// create and display a List<String>
			String[] colors = {"red", "white", "blue", "green", "gray", "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
			List<String> list = Arrays.asList(colors);
			Iterator<String> it = list.iterator();
			
			System.out.println("list: "+list);
			
			// eliminate duplicates then print the unique values
			printNonDuplicates(list);
		
		} // main()
		
		// create a Set from a Collection to eliminate duplicates
		private static void printNonDuplicates( Collection<String> values)
		{
			// create a HashSet
			HashSet<String> set = new HashSet<>(values);
			// or: Set<String> set = new HashSet<>(values);
			
			System.out.printf("%nNonduplicates are: ");
			for (String value : set)
			System.out.printf("%s ", value);
			
			System.out.println();
		}
	
}
