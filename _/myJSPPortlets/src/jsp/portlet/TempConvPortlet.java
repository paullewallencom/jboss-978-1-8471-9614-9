package jsp.portlet;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.PortletSecurityException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.UnavailableException;
import javax.portlet.ValidatorException;


public class TempConvPortlet extends GenericPortlet {

	double c_1;
	double c_2;
	double c_3;
		
	/* (non-Javadoc)
	 * @see javax.portlet.Portlet#init()
	 */
	@Override
	public void init() throws PortletException {
		
		super.init();
		
       c_1 = 32.0d;
		c_2 = (5.0d/9.0d);
		c_3 = (9.0d/5.0d);	 
        }
	
	/* (non-Javadoc)
	 * @see javax.portlet.GenericPortlet#doView(javax.portlet.RenderRequest, javax.portlet.RenderResponse)
	 */
	@Override
	protected void doView(RenderRequest request, RenderResponse response)
				throws PortletException, IOException, UnavailableException {
			
			//Sets the content type for the response.
			response.setContentType("text/html");

			//Gets the supplied temperature.
			String tempVal = request.getParameter("temp_val");
			
			//Clean up.
			Double tempNrVal = 0.0;
			request.setAttribute("errorAttr", "");
			
			//Validate the supplied temperature as a number.
			if (tempVal == null) { tempVal = "0.0";	}

			try {
				tempNrVal = Double.valueOf(tempVal);
			    } catch (Exception e) {
				tempNrVal = 0.0;
				tempVal = "0.0";
				request.setAttribute("errorAttr","<font color=\"red\"><b>ERROR:</b> The inserted value is not a number!</font></error>");
			}

	      //Check the PortletPreferences to get the conversion type.
			PortletPreferences portletPreferences = 
	                              request.getPreferences();

			String fromWhat = portletPreferences.getValue("fromWhat", "C");
			String toWhat = portletPreferences.getValue("toWhat", "F");	
		
		  //Apply the conversion formula,depending on conversion type.
			double result = 0.0;
			if (fromWhat.equals("C") && (toWhat.equals("F"))) {
				result = (tempNrVal - c_1) * c_2;
			} else {
				result = (tempNrVal * c_3) + c_1;
			}
			
			if (fromWhat.equals("C")) {
				request.setAttribute("fromWhatAttr", "Celsius");
				request.setAttribute("toWhatAttr", "Fahrenheit");
			} else {
				request.setAttribute("fromWhatAttr", "Fahrenheit");
				request.setAttribute("toWhatAttr", "Celsius");
			}

			request.setAttribute("tempValAttr", tempNrVal);
			request.setAttribute("convValAttr", result);

			//Dispatch to view.jsp.
			response.setProperty("expiration-cache","0");
			PortletRequestDispatcher portletRequestDispatcher = getPortletContext().getRequestDispatcher("/WEB-INF/view.jsp");
			portletRequestDispatcher.include(request, response);
		}

	/* (non-Javadoc)
	 * @see javax.portlet.GenericPortlet#doEdit(javax.portlet.RenderRequest, javax.portlet.RenderResponse)
	 */
	@Override
	protected void doEdit(RenderRequest request, RenderResponse response)
				throws PortletException, PortletSecurityException, IOException {
			
	 //Sets the content type for the response.
	 response.setContentType("text/html");

	 //Gets portlet preferences.
	 PortletPreferences portletPreferences = request.getPreferences();

	 String fromWhat = portletPreferences.getValue("fromWhat", "C");
	 String toWhat = portletPreferences.getValue("toWhat", "F");

	 //Put on request the portlet preferences.
	 request.setAttribute("fromWhatAttr", fromWhat);
	 request.setAttribute("toWhatAttr", toWhat);

	 //Check for errors.
	 String error = request.getParameter("error");
	 if (error != null) {
	 error = "<font color=\"red\"><b>ERROR: </b>" + error
	       + "</font></error>";
	    } else { error = ""; }

	 request.setAttribute("errorAttr", error);
			
	 //Dispatch to edit.jsp.
	 PortletRequestDispatcher portletRequestDispatcher = getPortletContext().getRequestDispatcher(
			"/WEB-INF/edit.jsp");
	 portletRequestDispatcher.include(request, response);
	}

	/* (non-Javadoc)
	 * @see javax.portlet.GenericPortlet#doHelp(javax.portlet.RenderRequest, javax.portlet.RenderResponse)
	 */
	@Override
	protected void doHelp(RenderRequest request, RenderResponse response)
				throws PortletException, PortletSecurityException, IOException {
			
	 //Sets the content type for the response.
	 response.setContentType("text/html");
			
	 //Dispatch to help.jsp.
	 PortletRequestDispatcher portletRequestDispatcher = getPortletContext().getRequestDispatcher(
			"/WEB-INF/help.jsp");
	 portletRequestDispatcher.include(request, response);
	}

	/* (non-Javadoc)
	 * @see javax.portlet.Portlet#processAction(javax.portlet.ActionRequest, javax.portlet.ActionResponse)
	 */
	@Override
	public void processAction(ActionRequest request, ActionResponse response)
			throws PortletException, PortletSecurityException, IOException {
		
	 PortletPreferences portletPreferences = request.getPreferences();

	 //Gets the supplied temperature.
	 String tempVal = request.getParameter("temp_val");

	 //Check the portlet mode
	 if (request.getPortletMode().equals(PortletMode.VIEW)) {
				
	 response.setRenderParameter("temp_val", tempVal);
				
	 } else if (request.getPortletMode().equals(PortletMode.EDIT)) {
				
		boolean flag;
		String errorMsg = null;
			
		String fromWhat = request.getParameter("from_what");
		String toWhat = request.getParameter("to_what");

		portletPreferences.setValue("fromWhat", fromWhat);
		portletPreferences.setValue("toWhat", toWhat);

		try {
			portletPreferences.store();
			flag = true;
	   	     } catch (ValidatorException e) {
			flag = false;
			errorMsg = e.getMessage();
		     }

		if (flag) {
			response.setPortletMode(PortletMode.VIEW);
			} else { response.setRenderParameter("error", errorMsg); }
	    	}
	    }
	}

