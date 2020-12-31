package esb.send.message;

import org.jboss.soa.esb.client.ServiceInvoker;
import org.jboss.soa.esb.message.Message;
import org.jboss.soa.esb.message.format.MessageFactory;

public class ESB
{
    public static void main(String args[]) throws Exception
    {
      //Setting the ConnectionFactory such that it will use scout
      System.setProperty("javax.xml.registry.ConnectionFactoryClass","org.apache.ws.scout.registry.ConnectionFactoryImpl");
        
      //access the TestJBossESB Service
      ServiceInvoker serviceInvoker = new 
       ServiceInvoker("MyServices", "TestJBossESB");
        
      //Get a Message instance
      Message message = MessageFactory.getInstance().getMessage();
        
      //Prepare the Message body
      message.getBody().add("Hello! I am an ESB Message ... who are you ?");
        
      //Deliver the message in asynchronous manner 
      serviceInvoker.deliverAsync(message);    	
    }    
} 

