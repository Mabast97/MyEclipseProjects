package combinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import static combinatorPattern.CustomerInterfaceValidator.*;
import static combinatorPattern.CustomerInterfaceValidator.ValidationResult.*;

public interface CustomerInterfaceValidator extends Function<Customer, ValidationResult>{
													// it means that takes a Customer as an input and gives a 
													// validationResult as an output.
	static CustomerInterfaceValidator isEmailValid()
	{
		return customer -> customer.getEmail().contains("@") ? SUCCESS : EMAIL_NOT_VALID;
	}
	
	static CustomerInterfaceValidator isPhoneValid()
	{
		return customer -> ( customer.getPhone().startsWith("0750") || customer.getPhone().startsWith("750") ) ?
				SUCCESS : PHONE_NOT_VALID;
	}
	
	static CustomerInterfaceValidator isAgeValid()
	{
		return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ?
				SUCCESS : AGE_NOT_VALID ;
	}
	
	default CustomerInterfaceValidator and (CustomerInterfaceValidator other)
	{
		return customer -> 
		{
			ValidationResult result = this.apply(customer);
			return result.equals(SUCCESS) ? other.apply(customer) : result;
		} ;
	}
	
	enum ValidationResult {
		SUCCESS,
		PHONE_NOT_VALID,
		EMAIL_NOT_VALID,
		AGE_NOT_VALID
	}
	
}
