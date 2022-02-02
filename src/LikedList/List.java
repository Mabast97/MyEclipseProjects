package LikedList;

public class List<T extends Comparable> {
	
	private ListNode<T> firstNode;
	private ListNode<T> lastNode;
	private String name;
	
	// constructor creates empty List with "list" as the name
	public List()
	{
		this("list");
	}
	
	// constructor creates empty List with "list" as the name
	public List(String listName)
	{
		name = listName;
		firstNode = lastNode = null;
	}
	
	public boolean isEmpty()
	{
		return firstNode == null;
	}
	
	public void insertAtFront(T insertItem)
	{
		if ( isEmpty() )
			firstNode = lastNode = new ListNode<T>(insertItem);
		else
			firstNode = new ListNode<T>(insertItem, firstNode);
	}
	
	public void insertAtBack(T insertItem)
	{
		if ( isEmpty() )
			firstNode = lastNode = new ListNode(insertItem);
		else
			lastNode = lastNode.nextNode = new ListNode<T>(insertItem);
	}
	
	public T removeFromFront() 
	{
		if (isEmpty())  throw new EmptyListException(name);
		
		T removedItem = firstNode.data;
		
		if (firstNode == lastNode)   firstNode = lastNode = null;
		else   firstNode = firstNode.nextNode;
		
		return removedItem;		
	}
	
	public T removeFromBack() 
	{
		if (isEmpty())  throw new EmptyListException(name);
		
		T removedItem = lastNode.data;
		
		if(firstNode == lastNode)   firstNode = lastNode = null;
		else
		{
			ListNode<T> current = firstNode;
			
			while(current.nextNode != lastNode)
				current = current.nextNode;
				
			lastNode = current;
			lastNode.nextNode = null;
		}
		
		return removedItem;		
	}
	
	public void print()
	{
		if (isEmpty()) {   System.out.println(name+" is Empty");  return;  }
		
		System.out.println(name + " is : ");
		ListNode current = firstNode;
		while(current != null)
		{
			System.out.print(current.data+", ");
			current = current.nextNode;
		}
			
		System.out.println();
	}
	
	public void sorting()
	{
		ListNode<T> current = firstNode;
		ListNode<T> index = null;
		T temp;
		
		if(isEmpty()) {  
            return;  
        }  
		else
		{
			while(current != null)
			{
				index = current.nextNode;
				
				while(index != null)
				{
					if( (current.data).compareTo(index.data) > 0)
					{
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.nextNode;
				} // while index
				current = current.nextNode;
			} // while current
		} // else
	} // sorting()
	
	public List<T> addingListToList(List<T> list1, List<T> list2)
	{
		ListNode<T> current2 = list2.firstNode;
		T temp;
		
		while (current2 != null)
		{
			temp = current2.data;
			list1.insertAtBack(temp);
			current2 = current2.nextNode;
		}
		return list1;
	}
	
	public void deletion(T deletedItem)
	{
		ListNode temp = firstNode;
		ListNode preTemp = firstNode;
		do {
			if(temp.data.equals(deletedItem))
				break;
			temp = temp.nextNode;
		}while(temp != null);
		System.out.println(" found : "+temp.data);
		
		while (preTemp.nextNode != temp)
			preTemp = preTemp.nextNode;
		System.out.println("preTemp : "+preTemp.data);
		preTemp.nextNode = temp.nextNode;
		temp = null;
	}
	
	public void insertBetween(T insertedItem, T afterItem)
	{
		ListNode temp = firstNode;
		ListNode insertedNode = firstNode;
		do {
			if(temp.data.equals(afterItem))
				break;
			temp = temp.nextNode;
		}while(temp != null);
		System.out.println(" found : "+temp.data);
		
		while (insertedNode.nextNode != temp)
			insertedNode = insertedNode.nextNode;
		System.out.println("preTemp : "+insertedNode.data);
		insertedNode.nextNode = new ListNode(insertedNode);
		insertedNode.nextNode.nextNode = temp;
	}
	

	public boolean searching(T item, List<T> list) 
	{
		ListNode<T> current = list.firstNode;
		do
		{
			System.out.println("Current " +current.data +", "+ item);
			if(current.data.equals(item))
			{
				return true;
			}
			current = current.nextNode;
		} while(current != null);
		
		return false;
		
	}
	
	
	public List<T> reversedList(List<T> list, List<T> reversedList) 
	{
		
		while ( !list.isEmpty() )
		reversedList.insertAtBack(list.removeFromBack());
		return reversedList;
		
		
		
		
//		ListNode<T> current = list.lastNode;
//		ListNode<T> preCurrent = list.firstNode.nextNode;
//		do
//		{
//			reversedList.insertAtBack(current.data);
//			while(preCurrent.nextNode != current)
//				preCurrent = preCurrent.nextNode;
//			reversedList.insertAtBack(preCurrent.data);
//			
//			do
//			{
//				while (preCurrent != current)
//					current = current.nextNode;
//			}while(preCurrent != list.firstNode);
//			
//			
//		}while (current == firstNode || preCurrent == firstNode);
		
		
//		int x=0;
//		int m=0;
//		do
//		{
//			while (preCurrent.nextNode != current)
//				preCurrent = preCurrent.nextNode;
//			reversedList.insertAtBack(preCurrent.data);
//			current = preCurrent;
//			preCurrent = list.firstNode;
//			x++;
//		} while (x<5);		
	}
	
	
	
} // end of class
