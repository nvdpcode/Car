package com.example.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.car.model.Car;
import com.example.car.services.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	
	CarService carService;
	
	@Autowired
	public CarController(CarService carService) {
		super();
		this.carService = carService;
	}
	
	@PostMapping("/save")
	public void save(@RequestBody Car j) {
		carService.save(j);
		
	}
	@PostMapping("/delete")
	public void delete(@RequestBody Car j) {
		carService.delete(j);
	}
	@GetMapping("/get")
	public List<Car> getAll(){
		return carService.getAll();
		
	}
}
