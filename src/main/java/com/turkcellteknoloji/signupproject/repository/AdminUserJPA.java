package com.turkcellteknoloji.signupproject.repository;

import javax.persistence.EntityManager;

public class AdminUserJPA implements AdminUserDAO {

private EntityManager entityManager;
	
	@Override
	public void addAdminUser(AdminUser adminUser) {
		entityManager.persist(adminUser);
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
