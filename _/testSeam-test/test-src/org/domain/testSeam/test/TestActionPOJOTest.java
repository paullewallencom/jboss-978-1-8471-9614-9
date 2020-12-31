package org.domain.testSeam.test;

import org.testng.annotations.Test;
import org.jboss.seam.mock.SeamTest;

public class TestActionPOJOTest extends SeamTest {

	@Test
	public void test_testActionMethod() throws Exception {
		new FacesRequest() {
			@Override
			protected void invokeApplication() {
				//call action methods here
				invokeMethod("#{testAction.testActionMethod}");
			}
		}.run();
	}
}
