package LikedList;

public class EmptyListException extends RuntimeException
{
	public EmptyListException()
	{
	 this("List"); // call other EmptyListException constructor
	}
	
	// constructor
	public EmptyListException(String name)
	{
	 super(name + " is empty"); // call superclass constructor
	}
} // end class EmptyListException

