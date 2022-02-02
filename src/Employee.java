
public class Employee {
	private String firstName;
	private String lastName;
	private static int count = 0; // number of objects in memory
	
	public Employee (String first, String last)
	{
		firstName = first;
		lastName = last;
		
		count++;  // increment static count of employees
		System.out.printf("Employee Constructor %s %S; count = %d\n", firstName, lastName, count);
	}
	
	protected void finalize()
	{
		count--;
		System.out.printf("\"Employee \" finalizer: %s %s; count = %d\n", firstName, lastName, count);
	}
	
	public String getLastN()
	{
		return lastName;
	}
	
	public String getFirstN()
	{
		return firstName;
	}
	
	public static int getCount()
	{
		return count;
	}
	

}
