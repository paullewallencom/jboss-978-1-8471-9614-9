package org.domain.testSeam.session;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.log.Log;
import org.jboss.seam.international.StatusMessages;
import org.hibernate.validator.Length;

@Name("testForm")
public class TestFormPOJO
{
    @Logger private Log log;

    @In StatusMessages statusMessages;

    private String value;

    public void testFormMethod()
    {
        // implement your business logic here
        log.info("testForm.testFormMethod() action called with: #{testForm.value}");
        statusMessages.add("testFormMethod #{testForm.value}");
    }

    // add additional action methods
  
    @Length(max = 10)
    public String getValue()
    {
        return value;
    }
  
    public void setValue(String value)
    {
        this.value = value;
    }
  
}
