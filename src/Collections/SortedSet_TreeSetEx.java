package Collections;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_TreeSetEx {
	public static void main(String args[])
	{
		// create TreeSet from array colors
		String[] colors = {"yellow", "green", "black", "tan", "grey",
		"white", "orange", "red", "green"};
		TreeSet<String> tree = new TreeSet<>(Arrays.asList(colors));
		SortedSet<String> sorted = (SortedSet<String>)tree;
		
		System.out.println("Array Colors : ");
		for(int i=0; i<colors.length; i++)
			System.out.print(colors[i]+" ");
		
		System.out.print("TreeSet : ");
		printSet(tree);
		
		System.out.print("sorted set: ");
		printSet(sorted);
		
		 // get headSet based on "orange"
		 System.out.print("headSet (\"orange\"): ");
		printSet( sorted.headSet("orange"));
		
		// get tailSet based upon "orange"
		System.out.print("tailSet (\"orange\"): ");
		printSet( sorted.tailSet("orange"));
		
		// get first and last elements
		System.out.printf("first: %s%n", sorted.first());
		System.out.printf("last : %s%n", sorted.last());
	}
	
	// output SortedSet using enhanced for statement
	private static void printSet(SortedSet<String> set)
	{
		for (String s : set)
		System.out.printf("%s ", s);
		
		System.out.println();
	}

}
