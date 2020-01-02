package com.ahmad.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahmad.convertors.CostumerConverter;
import com.ahmad.dto.AddressDto;
import com.ahmad.dto.CostumerDto;
import com.ahmad.entities.AddressEntity;
import com.ahmad.entities.CostumerEntity;
import com.ahmad.repository.CostumerRepository;

@Service
public class CostumerService {

	@Autowired
	private CostumerRepository costumerRepository;
	
	public void addAddress(Long id,AddressDto dto) throws Exception {
		CostumerEntity entity = costumerRepository.getCostumerById(id);
		if(entity == null) {
			throw new Exception("unknown id : " +id);
		}else {
			AddressEntity add = CostumerConverter.converAddress(dto);
			add.setCostumerEntity(entity);
			 costumerRepository.saveAddress(add);
		}
	}	
	
	

	public CostumerDto create(CostumerDto dto) {

		CostumerEntity ce = new CostumerEntity();
		ce.setFirstName(dto.getFirstName());
		ce.setLastName(dto.getLastName());
		ce.setGender(dto.getGender());
		ce.setPhone(dto.getPhone());
		ce.setSsn(dto.getSsn());
		ce.setEmail(dto.getEmail());

		return CostumerConverter.convertCustomer(costumerRepository.create(ce));

	}
}
