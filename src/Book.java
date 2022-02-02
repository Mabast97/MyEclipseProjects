
public enum Book {
	
	Test1("Book 1", "2003"),
	Test2("Book 2", "2004"),
	Test3("Book 3", "2005"),
	Test4("Book 4", "2006"),
	Test5("Book 5", "2007");
	
	private final String title;
	private final String cYear;
	
	
	Book(String bookTitle, String year)
	{
		title = bookTitle;
		cYear = year;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getcYar()
	{
		return cYear;
	}
}
