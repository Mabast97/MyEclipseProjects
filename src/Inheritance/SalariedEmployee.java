package Inheritance;

// Fig. 10.5: SalariedEmployee.java
 // SalariedEmployee class extends Employee.

public class SalariedEmployee extends Employee
{
 private double weeklySalary;

// four-argument constructor
 public SalariedEmployee( String first, String last, String ssn,
 double salary, Date birth )
 {
 super( first, last, ssn, birth ); // pass to Employee constructor
 setWeeklySalary( salary ); // validate and store salary
 } // end four-argument SalariedEmployee constructor
 
 // set salary
 public void setWeeklySalary( double salary )
 {
 weeklySalary = salary < 0.0 ? 0.0 : salary;
 } // end method setWeeklySalary

 // return salary
 public double getWeeklySalary()
 {
 return weeklySalary;
 } // end method getWeeklySalary
//calculate earnings; override abstract method earnings in Employee
public double earnings()
{
return getWeeklySalary();
} // end method earnings
//return String representation of SalariedEmployee object

public void increaseBonus(int bonus)
{
	weeklySalary += bonus;
	System.out.println(earnings());
}

public String toString()
{
	return String.format( "salaried employee: %s\n%s: $%,.2f",
			super.toString(), "weekly salary", getWeeklySalary() );
} // end method toString

} // end class SalariedEmployee	