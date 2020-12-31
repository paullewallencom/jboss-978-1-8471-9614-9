package jms.send.message;

import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.jms.QueueSession;
import java.util.Properties;
import javax.jms.JMSException;
import javax.naming.NamingException;

public class JMS {
	
    QueueConnection queueConnection;
    QueueSession queueSession;
    Queue queue;
    
    public void init() throws JMSException, NamingException
    {
    //you can put these properties in a jndi.properties file if don’t  
    //want them here
        Properties prop = new Properties();
	     prop.put(Context.INITIAL_CONTEXT_FACTORY,         
        "org.jnp.interfaces.NamingContextFactory");
	     prop.put(Context.URL_PKG_PREFIXES,   
        "org.jboss.naming:org.jnp.interfaces");
	     prop.put(Context.PROVIDER_URL, "jnp://127.0.0.1:1099");
 	     InitialContext iniContext = new InitialContext(prop);

    	  Object object = iniContext.lookup("ConnectionFactory");
    	  QueueConnectionFactory queueConnectionFactory =  
          (QueueConnectionFactory) object;
    	  queueConnection = 
          queueConnectionFactory.createQueueConnection();
    	  queue = (Queue) 
          iniContext.lookup("queue/ESBJMSApp_queue_gateway");
    	  queueSession = queueConnection.createQueueSession(false, 
          queueSession.AUTO_ACKNOWLEDGE);
    	
    	  queueConnection.start();
    	  System.out.println("Connection Started Successfully !");
    }      
    
    public void sendJMSMessage(String my_msg) throws JMSException {
    	
        QueueSender queueSender = queueSession.createSender(queue);        
        ObjectMessage objectMessage = 
         queueSession.createObjectMessage(my_msg);
        
        queueSender.send(objectMessage);        
        queueSender.close();
    }
    
    public void endAndClean() throws JMSException 
    { 
        queueConnection.stop();
        queueSession.close();
        queueConnection.close();
    }
    
    public static void main(String args[]) throws Exception
    {        	    	
    	JMS jms = new JMS();
    	
    	jms.init();
    	jms.sendJMSMessage
        ("Hello! I am an JMS Message ... who are you ?"); 
    	jms.endAndClean();
    }
}
