package com.jspiders.hospital.dto;

import java.util.List;

import lombok.Data;

@Data
public class Hospital {
	private int hospitalId;
	private String name;
	private String location;
	private List<Doctor> listOfDoctors;
}
