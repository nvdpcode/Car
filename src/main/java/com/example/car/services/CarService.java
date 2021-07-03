package com.example.car.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.car.model.Car;
import com.example.car.repository.CarRepository;

@Service
public class CarService {
	CarRepository carRepository;
 
	@Autowired
	public CarService(CarRepository carRepository) {
		super();
		this.carRepository = carRepository;
	}
	public void save(Car j) {
		carRepository.save(j);
		
	}
	public void delete(Car j) {
		 carRepository.delete(j);
	}
	 
	public List<Car> getAll(){
		return carRepository.findAll();
		
	}

}
