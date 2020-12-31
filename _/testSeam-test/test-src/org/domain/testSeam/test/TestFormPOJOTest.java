package org.domain.testSeam.test;

import org.testng.annotations.Test;
import org.jboss.seam.mock.SeamTest;

public class TestFormPOJOTest extends SeamTest {

	@Test
	public void test_testFormMethod() throws Exception {
		new FacesRequest() {
			@Override
			protected void updateModelValues() throws Exception {				
				//set form input to model attributes
				setValue("#{testForm.value}", "seam");
			}
			@Override
			protected void invokeApplication() {
				//call action methods here
				invokeMethod("#{testForm.testFormMethod}");
			}
			@Override
			protected void renderResponse() {
				//check model attributes if needed
				assert getValue("#{testForm.value}").equals("seam");
			}
		}.run();
	}
}
