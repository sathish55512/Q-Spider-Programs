package com.jspiders.annotation;

import lombok.Data;

@Data
public class Singleton {
	private static final Singleton  object = new Singleton();
	
	private Singleton(){}
	
	public static Singleton getObject() {
//		if(object == null) {
//			object = new Singleton();
//		}
		return object;
	}
}
