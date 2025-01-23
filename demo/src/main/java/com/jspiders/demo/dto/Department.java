package com.jspiders.demo.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	private int id;
	private String name;
	private String email;
	private String contactNumber;
	List<String> list;
}
