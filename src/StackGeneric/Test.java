package StackGeneric;

import java.util.EmptyStackException;


public class Test {
	public static void main(String[] args) {

		Double [] doubleElements = {1.1, 2.2, 3.3, 4.4, 5.5};
		Integer[] integerElements = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// Create a Stack<Double> and a Stack<Integer>
		Stack<Double> doubleStack = new Stack<>(5);
		Stack<Integer> integerStack = new Stack<>();

		testPush("Ingteger test : ", integerStack, integerElements);
		testPush("Double test : ", doubleStack, doubleElements);
		
		// push elements of doubleElements onto doubleStack
		testPop("doubleStack", doubleStack); // pop from doubleStack
		testPop("intStack", integerStack); // pop from doubleStack
		
	}
	
	public static <T> void testPush(String name, Stack<T> stack, T[] elements)
	{
		System.out.println("Pushing values for "+name+" : ");
		for (T i : elements)
		{
			System.out.println(i+" pushed");
			stack.push(i);
		}
	}
	
	public static <T> void testPop(String name, Stack<T> stack)
	{
		try
		{
			System.out.println("Poping elements from "+name);
			T popVal;

			while(true)
			{
				popVal = stack.pop();
				System.out.println(popVal+" : poped");
			}
		}catch (EmptyStackException empty)
		{
			System.err.println("Stack empty bro");
			empty.printStackTrace();
		}
		
	}
	
	
} // end of Class Test
