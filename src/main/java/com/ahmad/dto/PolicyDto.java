package com.ahmad.dto;

import java.util.Date;
import java.util.List;

import com.ahmad.entities.CoveredDriverEntity;

public class PolicyDto {

	private Long id;
	private String type;
	private String policyNumber;
	private Date startDate;
	private Date expireDate;
	private double privce;

	private List<CoveredDriverDto> coveredDriver;

	private List<CoveredVehicleDto> coveredVehicle;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public double getPrivce() {
		return privce;
	}

	public void setPrivce(double privce) {
		this.privce = privce;
	}

	public List<CoveredDriverDto> getCoveredDriver() {
		return coveredDriver;
	}

	public void setCoveredDriver(List<CoveredDriverDto> coveredDriver) {
		this.coveredDriver = coveredDriver;
	}

	public List<CoveredVehicleDto> getCoveredVehicle() {
		return coveredVehicle;
	}

	public void setCoveredVehicle(List<CoveredVehicleDto> coveredVehicle) {
		this.coveredVehicle = coveredVehicle;
	}


}
