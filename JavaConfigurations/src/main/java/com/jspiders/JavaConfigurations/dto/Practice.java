package com.jspiders.JavaConfigurations.dto;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

@Data
public class Practice {
    @Value("${id}")
    private int id;
    @Value("${name}")
    private String name;
    @Value("${email}")
    private String email;
    @Value("${age}")
    private int age;
    private Base base;
}
