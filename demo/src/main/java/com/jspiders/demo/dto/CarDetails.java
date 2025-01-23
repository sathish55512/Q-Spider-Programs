package com.jspiders.demo.dto;

import lombok.Data;

@Data
public class CarDetails {
	private int id;
	private String brand;
	private String name;
	private String color;
	private String mfd;
	
	public CarDetails(int id,String brand,String name,String color,String mfd) {
		this.id = id;
		this.brand = brand;
		this.name = name;
		this.color = color;
		this.mfd = mfd;
	}
	
}
