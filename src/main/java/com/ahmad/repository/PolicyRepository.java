package com.ahmad.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

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
	
	public PolicyEntity FindByPolicyNumber(String policyNumber) {
		Query q = manager.createQuery("from PolicyEntity p where p.policyNumber =:policyNumber");
		q.setParameter("policyNumber",policyNumber);
		
		return (PolicyEntity) q.getSingleResult();
	}
	

	public EntityManager getManager() {
		return manager;
	}

	@PersistenceContext
	public void setManager(EntityManager manager) {
		this.manager = manager;
	}

}
