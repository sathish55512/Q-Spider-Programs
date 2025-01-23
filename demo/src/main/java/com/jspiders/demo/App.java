package com.jspiders.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.demo.dto.Student;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
//        Object car1 = context.getBean("car1");
//        Object car2 = context.getBean("car2");
//        Object car3 = context.getBean("car3");
//        Object car4 = context.getBean("car4");
//        Object car5 = context.getBean("car5");
//        System.out.println(car1);
//        System.out.println(car2);
//        System.out.println(car3);
//        System.out.println(car4);
//        System.out.println(car5);
        Object dept1 = context.getBean("dept1");
        Object dept2 = context.getBean("dept2");
        System.out.println(dept1+"\n"+dept2);
    }
}
