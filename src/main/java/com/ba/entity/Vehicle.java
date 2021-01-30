package com.ba.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Vehicle")
public class Vehicle implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 100,name="vehicle_type")
	private String type;
	
	@Column(length = 100,name="model_code")
	private String modelCode;
	
	@Column(length = 100,name="brand_name")
	private String brandName;
	
	@Column(length = 100,name="launch_date")
	private Date launchDate;
}
