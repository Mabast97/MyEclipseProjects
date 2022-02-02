package myStack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;
public class Test {
	public static void main(String[] args) {
		Stack1 list = new Stack1();

		list.push(12);
		list.push(22);
		list.push(30);	
		list.print();
		list.pop();
		list.push(1.2);
		list.push("hi");
		list.print();
		list.pop();
		list.pop();
		list.pop();
		
		
		
		
		
		
	}
		
}
