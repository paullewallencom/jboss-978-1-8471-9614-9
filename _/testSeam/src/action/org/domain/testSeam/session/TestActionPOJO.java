package org.domain.testSeam.session;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.log.Log;
import org.jboss.seam.international.StatusMessages;

@Name("testAction")
public class TestActionPOJO
{
    @Logger private Log log;

    @In StatusMessages statusMessages;

    public void testActionMethod()
    {
        // implement your business logic here
        log.info("testAction.testActionMethod() action called");
        statusMessages.add("testActionMethod");
    }

    // add additional action methods

}
