package com.ahmad.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ahmad.entities.CostumerEntity;
import com.ahmad.entities.CoveredDriverEntity;
import com.ahmad.entities.CoveredVehicleEntity;
import com.ahmad.entities.PolicyEntity;

@Repository
@Transactional
public class PolicyRepository {

	private EntityManager manager;

	public PolicyEntity save(PolicyEntity p) {

		return manager.merge(p);
	}
	
	public CoveredDriverEntity saveDriver(CoveredDriverEntity d) {
		return manager.merge(d);
	}
	
	public CoveredVehicleEntity saveVehicle(CoveredVehicleEntity a) {
		return manager.merge(a);
	}
	
	public PolicyEntity getPolicyById(Long id) {
		return manager.find(PolicyEntity.class,id);
	}
	

	public EntityManager getManager() {
		return manager;
	}

	@PersistenceContext
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

}
