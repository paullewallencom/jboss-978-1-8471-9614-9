package org.domain.generateSeam.session;

import org.domain.generateSeam.entity.*;
import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("detailsHome")
public class DetailsHome extends EntityHome<Details> {

	@In(create = true)
	TestentityHome testentityHome;

	public void setDetailsId(Integer id) {
		setId(id);
	}

	public Integer getDetailsId() {
		return (Integer) getId();
	}

	@Override
	protected Details createInstance() {
		Details details = new Details();
		return details;
	}

	public void wire() {
		getInstance();
		Testentity testentity = testentityHome.getDefinedInstance();
		if (testentity != null) {
			getInstance().setTestentity(testentity);
		}
	}

	public boolean isWired() {
		if (getInstance().getTestentity() == null)
			return false;
		return true;
	}

	public Details getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
