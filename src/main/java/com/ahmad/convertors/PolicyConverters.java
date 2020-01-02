package com.ahmad.convertors;

import java.util.ArrayList;
import java.util.List;

import com.ahmad.dto.AddressDto;
import com.ahmad.dto.CoveredDriverDto;
import com.ahmad.dto.CoveredVehicleDto;
import com.ahmad.dto.PolicyDto;
import com.ahmad.entities.AddressEntity;
import com.ahmad.entities.CostumerEntity;
import com.ahmad.entities.CoveredDriverEntity;
import com.ahmad.entities.CoveredVehicleEntity;
import com.ahmad.entities.PolicyEntity;

public class PolicyConverters {

	// converting policy,driver and vehicle
	public static PolicyEntity convertPolicy(PolicyDto dto) {
		PolicyEntity entity = null;
		if (dto != null) {
			entity = new PolicyEntity();
			entity.setPolicyNumber(dto.getPolicyNumber());
			entity.setStartDate(dto.getStartDate());
			entity.setExpireDate(dto.getExpireDate());
			entity.setType(dto.getType());
			entity.setPrice(dto.getPrivce());

		}
		List<CoveredDriverEntity> driverEntities = new ArrayList<CoveredDriverEntity>();

		for (CoveredDriverDto driver : dto.getCoveredDriver()) {
			CoveredDriverEntity temp = convertDriver(driver);
			temp.setPolicy(entity);
			driverEntities.add(temp);
		}

		entity.setCoveredDriver(driverEntities);

		List<CoveredVehicleEntity> vehicleEntity = new ArrayList<CoveredVehicleEntity>();

		for (CoveredVehicleDto vehicle : dto.getCoveredVehicle()) {
			CoveredVehicleEntity cv = convertVehicle(vehicle);
			cv.setPolicy1(entity);
			vehicleEntity.add(cv);
		}

		entity.setCoveredVehicle(vehicleEntity);

		return entity;
	}

	public static CoveredDriverEntity convertDriver(CoveredDriverDto dto) {
		CoveredDriverEntity entity = null;
		if (dto != null) {
			entity = new CoveredDriverEntity();
			entity.setFirstName(dto.getFirstName());
			entity.setLastName(dto.getLastName());
			entity.setLicenseNumber(dto.getLisenceNumber());
			entity.setLicenseState(dto.getLisenceState());
		}
		return entity;
	}

	public static CoveredVehicleEntity convertVehicle(CoveredVehicleDto dto) {
		CoveredVehicleEntity entity = null;
		if (dto != null) {
			entity = new CoveredVehicleEntity();
			entity.setMake(dto.getMake());
			entity.setModel(dto.getModel());
			entity.setColor(dto.getColor());
			entity.setVin(dto.getVin());
			entity.setYear(dto.getYear());
		}
		return entity;
	}

}
