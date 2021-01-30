package com.ba.controller;

import com.ba.entity.Vehicle;
import com.ba.repository.VehicleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ba.converter.VehicleConverter;
import com.ba.dto.*;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class VehicleMutationResolver implements GraphQLMutationResolver{
	
	@Autowired
	private VehicleRepository repository;

	public Vehicle createVehicle(VehicleDTO vehicleDTO){
		return repository.save(VehicleConverter.toEntity(vehicleDTO));
		
	}
	
}
