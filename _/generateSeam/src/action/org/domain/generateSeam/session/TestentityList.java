package org.domain.generateSeam.session;

import org.domain.generateSeam.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("testentityList")
public class TestentityList extends EntityQuery<Testentity> {

	private static final String EJBQL = "select testentity from Testentity testentity";

	private static final String[] RESTRICTIONS = { "lower(testentity.name) like concat(lower(#{testentityList.testentity.name}),'%')", };

	private Testentity testentity = new Testentity();

	public TestentityList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Testentity getTestentity() {
		return testentity;
	}
}
