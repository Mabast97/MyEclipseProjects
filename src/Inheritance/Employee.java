package Inheritance;

public abstract class Employee{
 private String firstName;
 private String lastName;
 private String socialSecurityNumber;
 private Date birthDay;

 // three-argument constructor
 public Employee( String first, String last, String ssn, Date birth)
 {
 firstName = first;
 lastName = last;
 socialSecurityNumber = ssn;
 birthDay = birth;
 } // end three-argument Employee constructor

 public Date getDate()
 {
	 return birthDay;
 }
 
 // set first name
 public void setFirstName( String first )
 {
 firstName = first;
 } // end method setFirstName

 // return first name
 public String getFirstName()
 {
 return firstName;
 } // end method getFirstName

 // set last name
 public void setLastName( String last )
 {
 lastName = last;
 } // end method setLastName

 // return last name
 public String getLastName()
 {
 return lastName;
 } // end method getLastName

 // set social security number
 public void setSocialSecurityNumber( String ssn )
 {
 socialSecurityNumber = ssn; // should validate
 } // end method setSocialSecurityNumber

 // return social security number
 public String getSocialSecurityNumber()
 {
 return socialSecurityNumber;
 } // end method getSocialSecurityNumber
//return String representation of Employee object
 public String toString()
 {
 return String.format( "%s %s\nsocial security number: %s",
 getFirstName(), getLastName(), getSocialSecurityNumber() );
 } // end method toString
// abstract method overridden by subclasses
public abstract double earnings(); // no implementation here

 } // end abstract class Employee