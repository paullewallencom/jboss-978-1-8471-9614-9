package org.domain.generateSeam.session;

import org.domain.generateSeam.entity.*;
import java.util.ArrayList;
import java.util.List;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("testentityHome")
public class TestentityHome extends EntityHome<Testentity> {

	public void setTestentityId(Long id) {
		setId(id);
	}

	public Long getTestentityId() {
		return (Long) getId();
	}

	@Override
	protected Testentity createInstance() {
		Testentity testentity = new Testentity();
		return testentity;
	}

	public void wire() {
		getInstance();
	}

	public boolean isWired() {
		return true;
	}

	public Testentity getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

	public List<Details> getDetailses() {
		return getInstance() == null ? null : new ArrayList<Details>(
				getInstance().getDetailses());
	}

}
