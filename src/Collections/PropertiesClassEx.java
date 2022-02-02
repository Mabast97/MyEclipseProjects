package Collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesClassEx {
	public static void main(String args[])
	{
		Properties table = new Properties();
		
		// set properties
		table.setProperty("color", "blue");
		table.setProperty("width", "200");
		table.setProperty("color2", "yellow");
		table.setProperty("width2", "400");
		table.setProperty("color3", "green");
		table.setProperty("width3", "250");
		
		System.out.println("After setting properties");
		listProperties(table);
		
		// replace property value
		table.setProperty("color", "red");
		System.out.println("After replacing properties");
		listProperties(table);
		
		saveProperties(table);
		
		table.clear();
		
		System.out.println("After clearing properties");
		listProperties(table);
		
		loadProperties(table);
		
		//get value of property color
		Object value = table.getProperty("color");
		
		if (value != null)
			System.out.println("Property color's value is "+value);
		else
			System.out.println("Property color is not in a table");
		
		
	
	
	} // main()
	
	// save properties to a file
	private static void saveProperties(Properties prop)
	{
		// Save contents of a table
		try
		{
			FileOutputStream output = new FileOutputStream("C:\\Users\\High Tech\\Desktop\\props.dat");
			prop.store(output, "Sample Properties"); // save properties
			output.close();
			System.out.println("After saving properties");
			listProperties(prop);
		}
		catch (IOException ioException)
		{
			ioException.printStackTrace();
		}		
	} // saveProperties()
	
	//load properties from a file
	private static void loadProperties(Properties prop)
	{
		try
		{
			FileInputStream input = new FileInputStream("C:\\Users\\High Tech\\Desktop\\props.dat");
			prop.load(input);
			input.close();
			System.out.println("After loading properties : ");
			listProperties(prop);
		}catch (IOException ioExc)
		{
			ioExc.printStackTrace();
		}
		
	}
	
	

	private static void listProperties(Properties props)
	{
		Set<Object> keys = props.keySet();  // (key) akaani (property)yaka dayninawa u daykayna naw (set) ak.
		
		// output names/values pairs
		for(Object key : keys)
			System.out.printf("%s\t%s%n", key, props.getProperty((String) key));
		System.out.println();
	} // listProperties()
	
}
