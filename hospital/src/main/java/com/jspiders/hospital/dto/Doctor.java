package com.jspiders.hospital.dto;

import lombok.Data;

@Data
public class Doctor {
	private int doctorId;
	private String name;
	private String specialization;
	private int age;
	private double salary;	
	private int experience;
}
