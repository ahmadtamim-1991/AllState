package com.ahmad.dto;

public class CoveredVehicleDto {

	private Long id;
	private String make;
	private String model;
	private int year;
	private String color;
	private String vin;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	@Override
	public String toString() {
		return "CoveredVehicleDto [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", color="
				+ color + ", vin=" + vin + "]";
	}

}
