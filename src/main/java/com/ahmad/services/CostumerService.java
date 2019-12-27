package com.ahmad.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmad.dto.CostumerDto;
import com.ahmad.entities.CostumerEntity;
import com.ahmad.repository.CostumerRepository;

@Service
public class CostumerService {
	
	@Autowired
	private CostumerRepository costumerRepository;
	
	public CostumerDto create(CostumerDto dto) {
		
		CostumerEntity ce = new CostumerEntity();
		ce.setFirstName(dto.getFirstName());
		ce.setLastName(dto.getLastName());
		ce.setGender(dto.getGender());
		ce.setPhone(dto.getPhone());
		ce.setSsn(dto.getSsn());
		ce.setEmail(dto.getEmail());
		
		return convert(costumerRepository.create(ce));
					
		
		
		
	}


public static CostumerDto convert(CostumerEntity pe) {
	CostumerDto dto=null;
	if(pe != null) {
		dto=new CostumerDto();
		dto.setFirstName(pe.getFirstName());
		dto.setLastName(pe.getLastName());
		dto.setEmail(pe.getEmail());
		dto.setGender(pe.getGender());
		dto.setPhone(pe.getGender());
		dto.setSsn(pe.getSsn());
		 
		
	    
	}
	return dto;
}
}
