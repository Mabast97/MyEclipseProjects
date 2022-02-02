package LikedList;

import java.util.Collections;

import myStack.Test;

public class ListTest {

	public static void main(String[] args) {
		List<Integer> list = new List<>();
		List<Integer> list2 = new List<>();

//		list2.insertAtBack(0);
//		list2.insertAtBack(708);
//		list2.insertAtBack(900);
		
		list.insertAtBack(58);
		list.insertAtBack(50);
		list.insertAtBack(1);
		list.insertAtBack(505);
		list.insertAtBack(100);
		
//		list2.print();
//		list.print();
//		list.addingListToList(list, list2);
//		list.print();
		
		list.sorting();
		list.print();
		
		System.out.println(list.searching(1700, list));
		System.out.println();
		
		
		int x = 100;
		System.out.println("Deletion for value : "+x);
		list.deletion(x);
		list.print();
		
		list.insertBetween(1000, 505);
		list.print();
		
//		System.out.println("Reverse");
//		List<Integer> reversing = new List<>();
//		reversing = list.reversedList(list, reversing);
//		reversing.print();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	
		list.insertAtBack(5);
		list.insertAtBack(53);
		list.insertAtFront(-10);
		list.print();
		
		list.myTest(list2);
		list.print();
		
		try
		{
			int removedItem = list.removeFromFront();
			System.out.printf("%n%d removed Front %n", removedItem);
			list.print();
			
			removedItem = list.removeFromBack();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			removedItem = list.removeFromBack();
			System.out.printf("%n%d removed%n", removedItem);
			list.print();
			
			removedItem = list.removeFromFront();
			System.out.printf("%n%d removed Front %n", removedItem);
			list.print();
		}
		catch (EmptyListException emptyListException)
		{
			emptyListException.printStackTrace();
		}
		*/
	}
}
