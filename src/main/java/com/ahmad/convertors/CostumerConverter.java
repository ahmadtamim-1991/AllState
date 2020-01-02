package com.ahmad.convertors;

import java.util.ArrayList;
import java.util.List;

import com.ahmad.dto.AddressDto;
import com.ahmad.dto.CostumerDto;
import com.ahmad.entities.AddressEntity;
import com.ahmad.entities.CostumerEntity;

public class CostumerConverter {
	
	
	public static CostumerEntity convertAddress(CostumerDto dto) {
		CostumerEntity entity = null;
		if (dto != null) {
			entity = new CostumerEntity();
			entity.setFirstName(dto.getFirstName());
			entity.setLastName(dto.getLastName());
			entity.setEmail(dto.getEmail());
			entity.setGender(dto.getGender());
			entity.setPhone(dto.getPhone());
		}
		
		List<AddressEntity> addressEnity = new ArrayList<AddressEntity>();
		for (AddressDto address : dto.getAddress()) {
			AddressEntity add = converAddress(address);
			add.setCostumerEntity(entity);
			addressEnity.add(add);
			
		}
		entity.setAddress(addressEnity);
		
		
		return entity;
	}
	
	public static AddressEntity converAddress(AddressDto dto) {
		AddressEntity entity = null;
		if(dto != null) {
			entity=new AddressEntity();
			entity.setStreet(dto.getStreet());
			entity.setCity(dto.getCity());
			entity.setState(entity.getState());
			entity.setType(dto.getType());
			entity.setZip(dto.getZip());

		}
		return entity;
	}
	
	
	
	
	
//	public CostumerDto create(CostumerDto dto) {
//
//		CostumerEntity ce = new CostumerEntity();
//		ce.setFirstName(dto.getFirstName());
//		ce.setLastName(dto.getLastName());
//		ce.setGender(dto.getGender());
//		ce.setPhone(dto.getPhone());
//		ce.setSsn(dto.getSsn());
//		ce.setEmail(dto.getEmail());
//
//		return CostumerConverter.convert(costumerRepository.create(ce));
//
//	}
//
	public static CostumerDto convertCustomer(CostumerEntity pe) {
		CostumerDto dto = null;
		if (pe != null) {
			dto = new CostumerDto();
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
