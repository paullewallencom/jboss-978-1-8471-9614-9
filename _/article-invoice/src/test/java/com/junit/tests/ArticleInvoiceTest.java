package com.junit.tests;

import org.jbpm.graph.def.ProcessDefinition;
import org.jbpm.graph.exe.ProcessInstance;

import junit.framework.TestCase;

public class ArticleInvoiceTest extends TestCase {

	public void testProcess() throws Exception {

	// Extract a process definition from 
   //the processdefinition.xml file.
	ProcessDefinition processDefinition = 
     ProcessDefinition.parseXmlResource("article-invoice-pd/processdefinition.xml");
		
	 //test if the process definition is null
	 assertNotNull("Definition should not be null", 
         processDefinition);

	 // Create an instance of the process definition.
	ProcessInstance instance = new 
         ProcessInstance(processDefinition);
		
	 // Test if the execution is in start state.
	 assertEquals("Instance is in start-state", 
    instance.getRootToken().getNode().getName(),"submit article invoice");
		
	 // Set the invoice fields.
	 instance.getContextInstance().
     setVariable("author_name","Anghel");
		
    instance.getContextInstance().
    setVariable("author_email","leoprivacy@yahoo.com");	
		
    instance.getContextInstance().
    setVariable("article_name","Writing JUnit test cases for jBPM process");	
		
    instance.getContextInstance().
    setVariable("article_url","http://devx/...");	
		
    instance.getContextInstance().
    setVariable("article_fee","300$");	
		
	 // Leave the start-state and go further.
	 instance.signal();
		
		// Test if the exection is in financial controller state.
		assertEquals("Instance is in financial controler state",instance.getRootToken().getNode().getName(), "financial controller");			
		
		// Test if the invoice fields are null or not.
		assertNotNull("Check the author name!",instance.getContextInstance().
       getVariable("author_name"));
		assertNotNull("Check the author email!",instance.getContextInstance().
       getVariable("author_email"));
		assertNotNull("Check the article name!",instance.getContextInstance().
       getVariable("article_name"));
		assertNotNull("Check the article url!",instance.getContextInstance().
       getVariable("article_url"));
		assertNotNull("Check the article fee!",instance.getContextInstance().
       getVariable("article_fee"));
		
		// Leave the financial controller node and go further using the 
       //"accept invoice" transition.
		instance.signal("accept invoice");
		
		// Test if the process ended successfully.
		assertEquals("Instance is in end-state",instance.getRootToken().getNode().getName(),"the end");			
			
	}
}
