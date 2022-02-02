package ExceptionTest;

public class B{
	
	public static void mehtod2() throws Exception
	{
		try{
			throw new Exception("method2 Exception ");
		}catch(Exception e)
		{
			throw new Exception("method2 origin");
		}
	}

}
