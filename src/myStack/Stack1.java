package myStack;

import java.util.ArrayList;

public class Stack1<T>  
{
	 int top;
	ArrayList<T> items ;
	String name;
	
	public Stack1()
	{
		this("stack");
	}
	
	public Stack1(String string)
	{
		name = string;
		top = -1;
		items = new ArrayList<T>();
	}
	
	public void push(T item)
	{
		top++;
		items.add(item);
		System.out.println(item+" added");
	}
	
	public <T> void pop()
	{
		System.out.println( items.remove(items.size()-1)+" removed");
		print();
	}
	
	
	public void print()
	{
		try {
			System.out.println(items.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
	
}
