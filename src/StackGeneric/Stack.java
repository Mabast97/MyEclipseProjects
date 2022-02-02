package StackGeneric;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class Stack<T> {
	
	private final ArrayList<T> elements;
	
	public Stack()
	{
		this(10);
	}

	public Stack(int capacity) {
		int initialCapacity = (capacity<=0)? 10 : capacity;
		elements = new ArrayList<>(initialCapacity);  //????????????????????????????????????????
	}
	
	public void push (T pushVal)
	{
		elements.add(pushVal);
	}
	
	public T pop()
	{
		if (elements.isEmpty())
			throw new EmptyStackException();
		
		return elements.remove(elements.size()-1);
	}
	
	
	
	
} // end of Class


