package com.ba.converter;

import java.util.Date;

import com.ba.dto.VehicleDTO;
import com.ba.entity.Vehicle;

public class VehicleConverter {
	
	public static Vehicle toEntity(VehicleDTO dto) {
		
		Vehicle vehicle= new Vehicle();
		vehicle.setBrandName(dto.getBrandName());
		vehicle.setLaunchDate(new Date());
		vehicle.setModelCode(dto.getModelCode());
		vehicle.setType(dto.getType());
		return vehicle;
	}

}
