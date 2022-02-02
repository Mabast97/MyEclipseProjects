package ExceptionTest;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.SecurityException;
import java.nio.file.Paths;
			
public class ReadTextFile
{
	
	private static Scanner input; 
	
	public static void main(String args[])
	{
		openFile();
		readRecords();
		closeFile();
	}
	
	// open file clients.txt
	public static void openFile()
	{
		try
		{
			input = new Scanner(Paths.get("C:\\Users\\High Tech\\Desktop\\testing.txt"));
		}
		catch (IOException ioExc)
		{
			System.err.println("Error opening file. Terminating!");
			System.exit(1);
		}
	} // openFile()
	
	// read records to the file
	public static void readRecords()
	{
		System.out.printf("%-10s%-12s%-12s%10s%n", "Account", "First Name", "Last Name", "Balance");
		
		try
		{
			while(input.hasNext())  // while there is more to read
			{
				// display record contents
				System.out.printf("%-10d%-12s%-12s%10.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());
			}
		}
		catch (NoSuchElementException noElem )
		{
			System.err.println("File improperly formed. Terminating! ");
		}
		catch (IllegalStateException stateExc)
		{
			System.err.println("Error reading from file");
		}
		
	} // readRecords
	
	// close file and terminate application
	public static void closeFile()
	{
		if (input != null)
			input.close();
	} // closeFile
}
		



