package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx
{
	public static void main(String args[])
	{
		String[] colors ={"black", "yellow", "green", "blue", "violet", "silver"};
		List<String> list1 = new LinkedList<>();
		for (String items : colors)
			list1.add(items);
		print(list1);
		
		String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
		List<String> list2 = new LinkedList<>();
		for (String items : colors2)
			list2.add(items);
		print(list2);
		
		list1.addAll(list2);
		list2 = null;
		System.out.print("list1 after adding : ");
		print(list1);
		
		ListIterator<String> iterator = list1.listIterator();
		while(iterator.hasNext())
		{
			String color = iterator.next();
			iterator.set(color.toUpperCase());
		}
		
		print(list1);
		
	}

	public static void print(List<String> list)
	{
		System.out.print("List items = ");
		for (String items : list)
			System.out.print(items+" ");
		System.out.println();
			
	}
}
