package combinatorPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

	public boolean isEmailValid(String email)
	{
		return email.contains("@");
	}
	
	public boolean isPhoneNumberValid(String phoneNum)
	{
		return phoneNum.startsWith("0750") || phoneNum.startsWith("750");
	}
	
	public boolean isAgeValid(LocalDate date)
	{
		return Period.between(date, LocalDate.now()).getYears() > 16;
	}
	
	public boolean isValid(Customer customer)
	{
		return isEmailValid(customer.getEmail()) &&
				isPhoneNumberValid(customer.getPhone()) &&
				isAgeValid(customer.getDob());
	}
	
	
}
