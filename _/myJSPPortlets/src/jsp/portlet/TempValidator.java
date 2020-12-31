package jsp.portlet;

import javax.portlet.PreferencesValidator;
import javax.portlet.PortletPreferences;
import javax.portlet.ValidatorException;
import java.util.Set;
import java.util.HashSet;

public class TempValidator implements PreferencesValidator {
	
	public void validate(PortletPreferences preferences) throws ValidatorException {
	
	String fromWhat = preferences.getValue("fromWhat",null);
	String toWhat = preferences.getValue("toWhat",null);
	
	if (fromWhat==null || toWhat==null) 
	{
	Set set = new HashSet();
	set.add("fromWhat");
	set.add("toWhat");
	
	throw new ValidatorException("Preferences can't be NULL!",set);
	}
	
    if ((((!fromWhat.equals("F")) && (!fromWhat.equals("C")))||
       ((!toWhat.equals("F")) && (!toWhat.equals("C"))))||
       (fromWhat.equalsIgnoreCase(toWhat)))
        {
	   Set set = new HashSet();
	   set.add("fromWhat");
	   set.add("toWhat");
	   throw new ValidatorException("Insert 'F' (Fahrenheit) or 'C' (Celsius)",set);
	 }
   }
}


