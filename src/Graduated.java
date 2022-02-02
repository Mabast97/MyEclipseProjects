// Fig. 9.16: BasePlusCommissionEmployee5.java
// BasePlusCommissionEmployee5 class declaration.

public class Graduated extends Student
{
	private int salary;
	
	public Graduated( String firstName, String lastName, String universityName, int age, int salary )
	{
		super(firstName, lastName, universityName, age);
		setSalary(salary);
	}
	
	public void setSalary(int userSalary)
	{
		salary = (userSalary <= 0)? 0 : userSalary;		
	}
	
	public int getSalary()
	{
		return salary;
	}
	
	public String toString()
	{
		String s = super.toString()+" graduated "+", Salary: "+salary;
		
		return s;
	}
}
