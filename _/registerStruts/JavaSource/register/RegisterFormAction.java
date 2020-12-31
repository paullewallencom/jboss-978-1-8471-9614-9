package register;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RegisterFormAction extends org.apache.struts.action.Action {
    
    // Global Forwards
    public static final String GLOBAL_FORWARD_start = "start"; 

    // Local Forwards
    public static final String FORWARD_success = "success"; 

    
    public RegisterFormAction() {
    }
    
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        
    	RegisterFormBean registerData = (RegisterFormBean)(form);
    	int zip = Integer.valueOf(registerData.getZip());
    	String name = registerData.getName();
    	String email = registerData.getEmail();
    	
    	if(zip > 55555) { throw new Exception(); }
    	else {
    		  // process the inserted data
    	     }      	
    	return mapping.findForward(FORWARD_success);
    }
}
