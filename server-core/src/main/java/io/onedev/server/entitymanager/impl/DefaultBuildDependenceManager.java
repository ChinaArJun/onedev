package io.onedev.server.entitymanager.impl;

import javax.inject.Inject;
import javax.inject.Singleton;

import io.onedev.server.entitymanager.BuildDependenceManager;
import io.onedev.server.model.BuildDependence;
import io.onedev.server.persistence.dao.AbstractEntityManager;
import io.onedev.server.persistence.dao.Dao;

@Singleton
public class DefaultBuildDependenceManager extends AbstractEntityManager<BuildDependence> implements BuildDependenceManager {

	@Inject
	public DefaultBuildDependenceManager(Dao dao) {
		super(dao);
	}

}
