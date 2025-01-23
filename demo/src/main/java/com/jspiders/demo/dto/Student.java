package com.jspiders.demo.dto;

import lombok.Data;

@Data
public class Student {
	private int rollNo;
	private String name;
	private String email;
	private String address;
	private String gender;
	
	public void display() {
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(email);
		System.out.println(address);
		System.out.println(gender);
	}
}
