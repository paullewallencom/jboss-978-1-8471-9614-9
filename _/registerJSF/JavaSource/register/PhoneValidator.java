package register;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;
import javax.faces.application.FacesMessage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator implements Validator {

	public PhoneValidator() {
		// TODO Auto-generated constructor stub
	}

	public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
			throws ValidatorException {
		// TODO Auto-generated method stub
		System.out.println("//validate method//");		
	      
	      String value = ((PhoneNumber)arg2).getAllNumber();
	      String countryCode = "^[0-9]{1,2}";
	      String areaCode = "( |-|\\(){1}[0-9]{3}( |-|\\)){1}";
	      String prefixNumber = "( |-)?[0-9]{3}";
	      String number = "( |-)[0-9]{4}$";
	      Pattern mask =  Pattern.compile(countryCode+areaCode+prefixNumber+number);
	       
	       Matcher matcher = mask.matcher(value);
			 				 
	       if (!matcher.find()){	     	
	         FacesMessage message = new FacesMessage();
	         message.setDetail("Your phone number is not valid!");
	         message.setSummary("Your phone number is not valid!");
	         message.setSeverity(FacesMessage.SEVERITY_ERROR);
	         throw new ValidatorException(message);
	       }	     		

	}

}
