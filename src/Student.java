public class Student {

	private String fName;
	private String lName;
	private String uniName;
	private int age;
	
	public Student(String fN, String lN, String uniN, int studentAge)
	{
		fName = fN;
		lName = lN;
		uniName = uniN;
		setAge(studentAge);
		
		System.out.println("Student Const. = " + this);		
	}
	
	public void setAge(int a)
	{
		if (a < 12) 
			{
			System.out.println("It is under the required Age, set to ( 0 )");
			age = 0;
			}
		else age = a;
	}
	
	public int getAge()
	{
		return  age;
	}
	
	public void setFirstName(String name)
	{
		fName = name;
	}
	
	public String getFirstName()
	{
		return fName;
	}
	
	public void setLastName(String name)
	{
		lName = name;
	}
	
	public String getLastName()
	{
		return lName;
	}
	
	public void setUniName(String uni)
	{
		uniName = uni;
	}
	
	public String getUniName()
	{
		return uniName;
	}
	
	public String toString()
	{
		String s = "Super /-  Name: "+fName+" "+lName+", Age: "+age+", University Name: "+uniName;
		
		return s;
	}
	
	
} // class