
public class Date {
	private int month;
	private int day;
	private int year;
	
	public Date (int theDay, int theMonth, int theYear)
	{
		day = checkDay(theDay);
		month = checkMonth(theMonth);
		year = theYear;
		
		System.out.println("Date with println = " + this);
	}
	
	private int checkMonth(int testMonth)
	{
		if (testMonth > 0 && testMonth <= 12)
			return testMonth;
		else // month is invalid
			 {
			 System.out.printf( "Invalid month (%d) set to 1.", testMonth );
			 return 1; // maintain object in consistent state
			 } // end else
	}
	
	private int checkDay(int testDay)
	{
		int daysPerMonth[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		if (testDay > 0 && testDay <= daysPerMonth[month])  return testDay;
		
		if (month == 2 && testDay == 29 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ) )  return testDay;
		
		System.out.printf( "Invalid day (%d) set to 1.", testDay );
		return 1; // maintain object in consistent state
	}
	
	public String toString()
	{
		return String.format( "%d/%d/%d", day, month, year );
	}
	
	
}
