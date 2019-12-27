package com.ahmad.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ahmad.convertors.PolicyConverters;
import com.ahmad.dto.CoveredDriverDto;
import com.ahmad.dto.CoveredVehicleDto;
import com.ahmad.dto.PolicyDto;
import com.ahmad.entities.CostumerEntity;
import com.ahmad.entities.CoveredDriverEntity;
import com.ahmad.entities.CoveredVehicleEntity;
import com.ahmad.entities.PolicyEntity;
import com.ahmad.repository.CostumerRepository;
import com.ahmad.repository.PolicyRepository;

@Service
public class PolicyService {
	@Autowired
	private PolicyRepository policyRepository;
	@Autowired
	private CostumerRepository costumerRepository;

	public void createPolicy(Long id , PolicyDto policyDto) throws Exception {
		CostumerEntity entity = costumerRepository.getCostumerById(id);
		if (entity == null) {
			throw new Exception("there is no costumer with id : " + id);
		} else {
			PolicyEntity pe = PolicyConverters.convertPolicy(policyDto);
			pe.setCostumer(entity);
			if (pe != null) {
				policyRepository.save(pe);
			}
		}
	}
	
	public void createDriver(Long id , CoveredDriverDto dto) throws Exception {
		PolicyEntity entity = policyRepository.getPolicyById(id);
		if(entity == null) {
			throw new Exception("there is not policy with id : " +id);
		}
		else {
			CoveredDriverEntity driver=PolicyConverters.convertDriver(dto);
			driver.setPolicy(entity);
			if(driver != null ) {
				policyRepository.saveDriver(driver);
			}
		}
				
	
	}
	
	public void addVehicle (Long id , CoveredVehicleDto dto) throws Exception {
		PolicyEntity entity = policyRepository.getPolicyById(id);
		if(entity == null) {
			throw new Exception("there is no policy with id : " +id);
		}
		else {
			CoveredVehicleEntity vehicle = PolicyConverters.convertVehicle(dto);
			vehicle.setPolicy1(entity);
			if(vehicle != null) {
				policyRepository.saveVehicle(vehicle);
			}
		}
	}
	
	
	
}
