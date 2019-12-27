package com.ahmad.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ahmad.entities.CostumerEntity;

@Repository
@Transactional
public class CostumerRepository {

	private EntityManager entityManager;

	public CostumerEntity create(CostumerEntity ce) {
		return entityManager.merge(ce);

	}

	public CostumerEntity getCostumerById(Long id) {

		return entityManager.find(CostumerEntity.class, id);
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	@PersistenceContext
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
