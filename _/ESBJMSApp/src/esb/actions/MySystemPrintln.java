package esb.actions;

import org.jboss.soa.esb.actions.AbstractActionLifecycle;
import org.jboss.soa.esb.helpers.ConfigTree;
import org.jboss.soa.esb.message.Message;

//The org.jboss.soa.esb.actions.AbstractActionLifecycle is an 
//abstract class for lifecycle methods. This class implements the 
//ActionLifecycle interface that should be implemented by all Actions 
//that want to participate in the application lifecycle and should 
//not contain any state specific to a particular message instance.
public class MySystemPrintln extends AbstractActionLifecycle
{    
  //The ConfigTree class is used for run time configuration of ESB  
  //components. 	
  protected ConfigTree configTree;
	  
  public MySystemPrintln(ConfigTree configTree) 
  {
	  this.configTree = configTree; 
  } 
  
  //The Message class encapsulates a ESB message, which is made of 
  //the following components: Header, Context, Body, Fault, 
  //Attachment and Properties. 
  public Message printlnMessage(Message message) throws Exception{
		
   System.out.println("------------------------------------------");	
   //get the body component of the message
   System.out.println("---" + message.getBody().get() + "---");     
   System.out.println("------------------------------------------");
   return message; 
   }    	
}
