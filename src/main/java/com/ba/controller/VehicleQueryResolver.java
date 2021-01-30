package com.ba.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ba.entity.Vehicle;
import com.ba.repository.VehicleRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;


@Component
public class VehicleQueryResolver implements GraphQLQueryResolver{
	
	@Autowired
	private VehicleRepository repository;
	
	
	public List<Vehicle> getVehicleByType(String type){
		return repository.getByTypeLike(type);
		
	}
	public Optional<Vehicle> getById(Long id){
		return repository.findById(id);
		
	}
}
