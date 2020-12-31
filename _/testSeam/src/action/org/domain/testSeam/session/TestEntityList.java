package org.domain.testSeam.session;

import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityQuery;
import org.domain.testSeam.entity.TestEntity;

@Name("testEntityList")
public class TestEntityList extends EntityQuery<TestEntity>
{
    public TestEntityList()
    {
        setEjbql("select testEntity from TestEntity testEntity");
    }
}
