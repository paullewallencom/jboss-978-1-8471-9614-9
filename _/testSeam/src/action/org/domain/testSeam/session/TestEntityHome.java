package org.domain.testSeam.session;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Begin;
import org.jboss.seam.annotations.web.RequestParameter;
import org.jboss.seam.framework.EntityHome;

import org.domain.testSeam.entity.TestEntity;

@Name("testEntityHome")
public class TestEntityHome extends EntityHome<TestEntity>
{
    @RequestParameter Long testEntityId;

    @Override
    public Object getId()
    {
        if (testEntityId == null)
        {
            return super.getId();
        }
        else
        {
            return testEntityId;
        }
    }

    @Override @Begin
    public void create() {
        super.create();
    }

}
