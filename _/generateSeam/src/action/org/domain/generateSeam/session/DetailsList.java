package org.domain.generateSeam.session;

import org.domain.generateSeam.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import java.util.Arrays;

@Name("detailsList")
public class DetailsList extends EntityQuery<Details> {

	private static final String EJBQL = "select details from Details details";

	private static final String[] RESTRICTIONS = {
			"lower(details.email) like concat(lower(#{detailsList.details.email}),'%')",
			"lower(details.pass) like concat(lower(#{detailsList.details.pass}),'%')",
			"lower(details.zip) like concat(lower(#{detailsList.details.zip}),'%')", };

	private Details details = new Details();

	public DetailsList() {
		setEjbql(EJBQL);
		setRestrictionExpressionStrings(Arrays.asList(RESTRICTIONS));
		setMaxResults(25);
	}

	public Details getDetails() {
		return details;
	}
}
