package com.jspiders.JavaConfigurations.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
public class Base {
	@Value("1")
	private int property;
}
