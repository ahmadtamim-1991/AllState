package com.ahmad.convertors;

import java.util.ArrayList;
import java.util.List;

import com.ahmad.dto.CoveredDriverDto;
import com.ahmad.dto.CoveredVehicleDto;
import com.ahmad.dto.PolicyDto;
import com.ahmad.entities.CoveredDriverEntity;
import com.ahmad.entities.CoveredVehicleEntity;
import com.ahmad.entities.PolicyEntity;

public class PolicyEntityToDto {
	
	
	public static PolicyDto convertPolicy(PolicyEntity entity) {
		PolicyDto dto = null;
		if(entity != null) {
			dto=new PolicyDto();
			dto.setPolicyNumber(entity.getPolicyNumber());
			dto.setType(entity.getType());
			dto.setPrivce(entity.getPrice());
			dto.setStartDate(entity.getStartDate());
			dto.setExpireDate(entity.getExpireDate());
			
			List<CoveredDriverDto> driverDto = new ArrayList<CoveredDriverDto>();
			for(CoveredDriverEntity driver : entity.getCoveredDriver()) {
				CoveredDriverDto cdd = convertDriver(driver);
				driverDto.add(cdd);
			}
			dto.setCoveredDriver(driverDto);
			
			List<CoveredVehicleDto> vehicleDto=new ArrayList<CoveredVehicleDto>();
			for(CoveredVehicleEntity vehicle : entity.getCoveredVehicle()) {
				CoveredVehicleDto cvd = convertVehicle(vehicle);
				vehicleDto.add(cvd);
			}
			dto.setCoveredVehicle(vehicleDto);
		}
		
		return dto;
	}
	
	
	public static CoveredDriverDto convertDriver(CoveredDriverEntity entity) {
		CoveredDriverDto dto=null;
		if(entity != null) {
			dto =new CoveredDriverDto();
			dto.setFirstName(entity.getFirstName());
			dto.setLastName(entity.getLastName());
			dto.setLisenceNumber(entity.getLicenseNumber());
			dto.setLisenceState(entity.getLicenseState());
			dto.setStatus(entity.getStatus());
			
		}
		return dto;
	}
	
	public static CoveredVehicleDto convertVehicle(CoveredVehicleEntity entity) {
		CoveredVehicleDto dto=null;
		if(entity != null) {
			dto=new CoveredVehicleDto();
			dto.setMake(entity.getMake());
			dto.setModel(entity.getModel());
			dto.setColor(entity.getColor());
			dto.setVin(entity.getVin());
			dto.setYear(entity.getYear());
		}
		return dto;
	}
	
	
	

}
