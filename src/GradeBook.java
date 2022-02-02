import java.util.Scanner;

public class GradeBook {
	private String CourseName;
	private String instructorName;
 	
  	public GradeBook(String cName, String iName)
 	{
 		CourseName = cName;
 		instructorName = iName;
 	}
	
	public void desplayMessage()
	{
		System.out.println("Welcome to the : "+ getCourseName());
		System.out.println("This course is presented by : "+ getInstructorName());
	}
	
	
	public String getCourseName()
	{
		return CourseName;
	}
	public void setCourseName(String name)
	{
		CourseName = name;
	}
	
	public void setInstructorName(String iName) {
		instructorName = iName;
	}
	public String getInstructorName() {
		return instructorName;
	}
	
}
