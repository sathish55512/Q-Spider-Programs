package com.jspiders.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.annotation.dto.Base;
import com.jspiders.annotation.dto.Practice;

import org.springframework.context.ApplicationContext;


public class App {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
//        Practice bean = context.getBean(Practice.class);
//        Base bean2 = context.getBean(Base.class);
//        Base bean3 = context.getBean(Base.class);
//        System.out.println(bean+"\n"+bean2);
//        System.out.println(bean2==bean3);
    	
    	Singleton s = Singleton.getObject();
    	Singleton s1 = Singleton.getObject();
    	System.out.println(s+"\n"+s1);

    }
}
