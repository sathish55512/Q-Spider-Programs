package com.jspiders.annotation.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
//component tag is uded to make the class as component type, then only it is eligible to creating bean
public class Practice {
    @Value("${id}")
    private int id;
    @Value("${name}")
    private String name;
    @Value("${email}")
    private String email;
    @Value("${age}")
    private int age;
    @Autowired
    private Base base;
}
