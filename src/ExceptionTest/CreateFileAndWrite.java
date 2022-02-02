package ExceptionTest;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
			
class CreateFileAndWrite
{
	  
	private static Formatter output; 
	
	public static void main(String args[])
	{
		openFile();
		addRecords();
		closeFile();
	}
	
	// open file clients.txt
	public static void openFile()
	{
		try
		{
			output = new Formatter("C:\\Users\\High Tech\\Desktop\\testing.txt");
		}
		catch (SecurityException securityExc)
		{
			System.err.println("Write permission denied. Terminating!");
			System.exit(1);
		}
		catch (FileNotFoundException notFound)
		{
			System.err.println("Error opening File. Terminating!");
			System.exit(1);
		}
	} // openFile()
	
	// add records to the file
	public static void addRecords()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Account num, first n, last n, balance");
		
		while(input.hasNext())
		{
			try
			{
				output.format("%d %s %s %.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
			}
			catch (FormatterClosedException closingExc)
			{
				System.err.println("Error writing to file. Terminating! ");
				break;
			}
			catch (NoSuchElementException noElem)
			{
				System.err.println("Invalid input. try again");
				input.nextLine();
			}
			
			System.out.println("? ");
		} // while
		
	} // addRecords
	
	public static void closeFile()
	{
		if (output != null)
		output.close();
	} // closeFile
}
		



