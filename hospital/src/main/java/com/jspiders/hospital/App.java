package com.jspiders.hospital;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.hospital.dto.Hospital;

public class App {
    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
       Hospital hospital1 = (Hospital)context.getBean("hospital1");
       Hospital hospital2 = (Hospital)context.getBean("hospital2");
       System.out.println(hospital1+"\n"+hospital2);
    }
}
