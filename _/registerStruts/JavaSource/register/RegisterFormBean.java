package register;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;

public class RegisterFormBean extends org.apache.struts.validator.ValidatorForm { //org.apache.struts.action.ActionForm {

	private String name="";
	private String zip="";
	private String email="";
	
    public RegisterFormBean () {
    }   
    
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void reset(ActionMapping actionMapping, HttpServletRequest request) {
        this.name="";
        this.zip="";
        this.email="";
    }
	/*
    public ActionErrors validate(ActionMapping actionMapping, HttpServletRequest request) {
    	ActionErrors errors = new ActionErrors();
    	return errors;
    }
    */
}
