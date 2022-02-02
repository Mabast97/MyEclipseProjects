import java.util.Scanner;


public class InvoiceTest {
	

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String s1,s2;
		System.out.println("Your Num1 & Num2: ");
		s1 = input.nextLine();
		System.out.println("\nNum2 : ");
		s2 = input.nextLine();
		
		int result = sum(s1,s2);
		String resultString = Integer.toString(result)+"i";
		System.out.println(resultString);
		
		
	}
	
	public static int sum(String s1, String s2)
	{
		String newS1 = "";
		String newS2 = "";
		
		for(int i=0; i<s1.length(); i++)
		{
			if ( (int) s1.charAt(i) == 105 )
			{
				break;
			}
			newS1 += s1.charAt(i);
		}
		
		for(int i=0; i<s2.length(); i++)
		{
			if ( (int) s2.charAt(i) == 105 )
			{
				break;
			}
			newS2 += s2.charAt(i);
		}

		int ss1 = Integer.parseInt(newS1);
		int ss2 = Integer.parseInt(newS2);
		int sum = ss1 + ss2;
		
		return sum;
	} // sum()

}
