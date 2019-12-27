package com.ahmad.dto;

public class CoveredDriverDto {

	private Long id;
	private String firstName;
	private String lastName;
	private String lisenceNumber;
	private String lisenceState;
	private Boolean status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLisenceNumber() {
		return lisenceNumber;
	}

	public void setLisenceNumber(String lisenceNumber) {
		this.lisenceNumber = lisenceNumber;
	}

	public String getLisenceState() {
		return lisenceState;
	}

	public void setLisenceState(String lisenceState) {
		this.lisenceState = lisenceState;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
