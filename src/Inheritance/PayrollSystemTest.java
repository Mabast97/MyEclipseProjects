package Inheritance;

public class PayrollSystemTest {

	public static void main(String[] args) {
		
		// create subclass objects
		SalariedEmployee salariedEmployee =
		new SalariedEmployee( "John", "Smith", "111-11-1111", 800.00, new Date(2,4,2010) );
		HourlyEmployee hourlyEmployee =
		new HourlyEmployee( "Karen", "Price", "222-22-2222",new Date(2,3,1990), 16.75, 40 );
		CommissionEmployee commissionEmployee =
		new CommissionEmployee( "Sue", "Jones", "333-33-3333", new Date(1,5,2000), 10000, .06 );
		BasePlusCommissionEmployee basePlusCommissionEmployee =
		new BasePlusCommissionEmployee( "Bob", "Lewis", "444-44-4444", new Date(2,6,2001), 5000, .04, 300 );
		PieceWorker pieceWorker = new PieceWorker("Mabast", "H.","122-12-1212", new Date(4,4,2004), 3, 30);
		
		Date birthDay = new Date(1,6,2001);
		
		System.out.println("-----------------------------");

		System.out.println("salariedEmployee = "+ salariedEmployee.toString());
		System.out.println("-----------------------------");
		System.out.println("hourlyEmployee = "+ hourlyEmployee.toString());
		System.out.println("-----------------------------");
		System.out.println("commissionEmployee = "+ commissionEmployee.toString());
		System.out.println("-----------------------------");
		System.out.println("basePlusCommissionEmployee = "+ basePlusCommissionEmployee.toString());
		System.out.println("-----------------------------");
		System.out.println("pieceWorker = "+ pieceWorker.toString());
		System.out.println("-----------------------------");
		System.out.println("-----------------------------");
		
		Employee empArray[] = new Employee[5];

		empArray[0] = salariedEmployee;
		empArray[1] = hourlyEmployee;
		empArray[2] = commissionEmployee;
		empArray[3] = basePlusCommissionEmployee;
		empArray[4] = pieceWorker;
		
		for ( Employee i : empArray )
		{
			System.out.println("NEW Earning of "+i+" is "+i.earnings()+"\n");
		}
		
		
		/*
		for (Employee e : empArray)
		{
			String strE = e.getDate().toString();
			
			System.out.println("birthDay = "+strBirthDay);
			System.out.println("e.getDate() = "+strE);
			//if(strE.charAt(0) == strBirthDay.charAt(0) && strE.charAt(2) == strBirthDay.charAt(2))
			//if (e.getDate()==(birthDay)) or (e.getDate().equals(birthDay)) Done with my own methd, but why it is not true ?
			if (birthDay.equal(e.getDate())) 
			{ 
				System.out.println("yeah");
				e.increaseBonus(100);
			}else
				System.out.println("nope");
			
		}
		*/
		
		
	} // end main
	 } // end class PayrollSystemTest
	
