package com.example.car.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Car {
	@Id
	int id;
	String company;
	int average;
	int highSpeed;
	String carName;
	
	public Car() {
		super();
	}
	
	public Car(int id, String company, int average, int highSpeed, String carName) {
		super();
		this.id = id;
		this.company = company;
		this.average = average;
		this.highSpeed = highSpeed;
		this.carName = carName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public int getHighSpeed() {
		return highSpeed;
	}
	public void setHighSpeed(int highSpeed) {
		this.highSpeed = highSpeed;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}

}
