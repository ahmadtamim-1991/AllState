package com.ahmad.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coveredDrivers")
public class CoveredDriverEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "firstName")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "lisenceNumber")
	private String lisenceNumber;
	@Column(name = "lisenceState")
	private String lisenceState;

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

	@Override
	public String toString() {
		return "CoveredDriverEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", lisenceNumber=" + lisenceNumber + ", lisenceState=" + lisenceState + "]";
	}

}
