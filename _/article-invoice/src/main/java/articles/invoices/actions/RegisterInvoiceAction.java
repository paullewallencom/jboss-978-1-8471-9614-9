package articles.invoices.actions;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;

/**
 * @author Anghel Leonard
 *
 */
public class RegisterInvoiceAction implements ActionHandler {

	/* (non-Javadoc)
	 * @see org.jbpm.graph.def.ActionHandler#execute(org.jbpm.graph.exe.ExecutionContext)
	 */
	public void execute(ExecutionContext executionContext) throws Exception {
		
		//extract the invoice information
		String author_name = String.valueOf (executionContext.getContextInstance().getVariable("author_name"));
        String author_email = String.valueOf (executionContext.getContextInstance().getVariable("author_email"));
		String article_name = String.valueOf (executionContext.getContextInstance().getVariable("article_name"));
		String article_url = String.valueOf (executionContext.getContextInstance().getVariable("article_url"));
		String article_fee = String.valueOf (executionContext.getContextInstance().getVariable("article_fee"));
		
		//check to see if the information were correctly extracted
		System.out.println("Author name:"+author_name);
		System.out.println("Author e-mail:"+author_email);
		System.out.println("Article name:"+article_name);
		System.out.println("Article URL:"+article_url);
		System.out.println("Article fee:"+article_fee);
		
		//PUT HERE MORE CODE TO PROCESS THE INVOICE INFORMATION
		//store the invoice information into a database, XML file, text   
      //file, etc.

		//leave this node
		executionContext.leaveNode("leave register"); 	
	}
}

