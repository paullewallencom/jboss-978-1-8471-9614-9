package articles.invoices.actions;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

/**
 * @author Anghel Leonard
 *
 */
public class PayInvoiceAction implements ActionHandler {

	/* (non-Javadoc)
	 * @see org.jbpm.graph.def.ActionHandler#execute(org.jbpm.graph.exe.ExecutionContext)
	 */
	public void execute(ExecutionContext executionContext) throws Exception {
		
		//display a start log message
		System.out.println("SEND PAYMENT STARTED!");
		
		//PUT HERE MORE CODE TO ACCESS AN ONLINE PAYMENT SYSTEM
		//per example, use the ECHOPay for Java 

		//display an end  log message
		System.out.println("SEND PAYMENT ENDED!");
		
		//leave this node
		executionContext.leaveNode("leave payment");
	}
}

