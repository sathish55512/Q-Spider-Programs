package com.jspiders.JavaConfigurations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jspiders.JavaConfigurations.config.JavaConfiguration;
import com.jspiders.JavaConfigurations.dto.Base;
import com.jspiders.JavaConfigurations.dto.Practice;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfiguration.class);
        System.out.println(context.getBean(Practice.class));
    }
}
