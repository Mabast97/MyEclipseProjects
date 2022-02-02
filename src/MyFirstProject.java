import java.util.Scanner;

public class MyFirstProject {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		/*
		System.out.println("Before anything : ");
		GradeBook g = new GradeBook("Java","Mabast");
		g.desplayMessage();
		
		g.setCourseName("Test");
		System.out.println("After the things :");
		g.desplayMessage();
		
		GradeBook g2 = new GradeBook("C++", "Ali");
		System.out.println("G2 = ");
		g2.desplayMessage();
		 */
		
	
			
		Account a1 = new Account(50.5);
		System.out.println("\n The Current Balance =  " + a1.getBalance());
		System.out.println("Enter Deposit Amount = ");
		double dValue = in.nextDouble();
		a1.deposit(dValue);
		double test = a1.getBalance();
		System.out.println("Balance is = "+ a1.getBalance());
		
		double wValue;
		System.out.println("Enter the amount to withdraw : ");
		wValue = in.nextDouble();
		a1.withdraw(wValue);
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		Scanner s = new Scanner(System.in);
//		int aa;
//		int bb;
//		int m=0;
//		
//		System.out.println("Number \t "+"Square \t"+"Cube");
//
//		System.out.println(m+" \t   "+m+" \t \t  "+m);
//		for (int i=0; i<1; i++)
//		{
//			for(int j=0; j<=10; j++)
//			{
//				aa=j*j;
//				bb=j*j*j;
//				
//				System.out.println(j+" \t   "+aa+" \t \t  "+bb);
//				
//				
//			}
//		}
		
