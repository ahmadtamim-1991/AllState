package com.ahmad.dto;

import java.util.Date;

public class PolicyDto {

	private Long id;
	private String type;
	private String policyNumber;
	private Date startDate;
	private Date expireDate;
	private double privce;

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

	@Override
	public String toString() {
		return "PolicyDto [id=" + id + ", type=" + type + ", policyNumber=" + policyNumber + ", startDate=" + startDate
				+ ", expireDate=" + expireDate + ", privce=" + privce + "]";
	}

}
