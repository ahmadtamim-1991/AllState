package com.ahmad.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class PolicyEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "type")
	private String type;
	@Column(name = "policyNumber")
	private String policyNumber;
	@Column(name = "startDate")
	private Date startDate;
	@Column(name = "expireDate")
	private Date expireDate;
	@Column(name = "price")
	private double price;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "costumerId")
	private CostumerEntity costumer;

	@OneToMany(mappedBy = "policy",cascade = CascadeType.ALL )
	private List<CoveredDriverEntity> coveredDriver;

	@OneToMany(mappedBy = "policy1",cascade = CascadeType.ALL )
	private List<CoveredVehicleEntity> coveredVehicle;

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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public CostumerEntity getCostumer() {
		return costumer;
	}

	public void setCostumer(CostumerEntity costumer) {
		this.costumer = costumer;
	}

	public List<CoveredDriverEntity> getCoveredDriver() {
		return coveredDriver;
	}

	public void setCoveredDriver(List<CoveredDriverEntity> coveredDriver) {
		this.coveredDriver = coveredDriver;
	}

	public List<CoveredVehicleEntity> getCoveredVehicle() {
		return coveredVehicle;
	}

	public void setCoveredVehicle(List<CoveredVehicleEntity> coveredVehicle) {
		this.coveredVehicle = coveredVehicle;
	}

}
