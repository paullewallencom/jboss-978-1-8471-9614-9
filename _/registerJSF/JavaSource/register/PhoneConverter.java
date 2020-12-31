package register;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import java.util.StringTokenizer;

public class PhoneConverter implements Converter {

	public PhoneConverter() {
		// TODO Auto-generated constructor stub
	}

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {
		// TODO Auto-generated method stub
		System.out.println("//getAsObject method//");		
	    
	    StringTokenizer st = new StringTokenizer(arg2,"-");
	    PhoneNumber pn = new PhoneNumber();
	    try{
	        pn.setAllNumber(arg2);
	        pn.setCountryCode(st.nextToken());
	        pn.setAreaCode(st.nextToken());
	        pn.setPrefixNumber(st.nextToken());
	        }catch (Exception e){ return pn; }
	    
	    return pn;
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		// TODO Auto-generated method stub
	    System.out.println("//getAsString method//");
	    if(arg2 != null) 
	      {
	      String value = ((PhoneNumber)arg2).getAllNumber();
	      return value; 
	      }
	    
	    return "";
	}

}
