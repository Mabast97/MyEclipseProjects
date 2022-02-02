import static java.lang.Math.*;

public class EmployeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf( "Employees before instantiation: %d\n\n", Employee.getCount() );

		Employee em = new Employee( "Mabast", "H." );
		Employee em2 = new Employee( "Ahmed", "S." );
		Employee em3 = new Employee("te", "st");
		
		// show that count is 2 after creating two Employees
		System.out.println( "\nEmployees after instantiation: " );
		System.out.printf( "via e1.getCount(): %d\n", em.getCount());
		System.out.printf( "via e2.getCount(): %d\n", em2.getCount());
		System.out.printf( "via Employee.getCount(): %d\n", Employee.getCount() );
		
		// get names of Employees
		System.out.printf( "\nEmployee 1: %s %s\nEmployee 2: %s %s\n\n",
				em.getFirstN(), em.getLastN(),
				em2.getFirstN(), em2.getLastN() );
		
		// in this example, there is only one reference to each Employee,
		// so the following two statements cause the JVM to mark each
		// Employee object for garbage collection
		em = null;
		

		int x = 83;
		System.out.println(ceil(x));

		System.out.println( "\nEmployees after setting to (Null) : " );
		System.out.printf( "via e1.getCount(): %d %n", em.getCount());
		System.out.printf( "via e1.getCount(): %d %n", em.getCount());
		System.out.printf( "via e2.getCount(): %d %n", em2.getCount());
		System.out.printf( "via Employee.getCount(): %d %n", Employee.getCount() );
		
		System.out.println();
		System.gc();
		
	}


}
