package com.jspiders.demo;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);


    	System.out.println("CRUD operations");
    	while(true) {
    		System.out.println("Select the Operation Needed to Perform");
    		System.out.println("1:Insert\n2:Update\n3:Delete\n4:Find\n5:Exit");
    		int choice = in.nextInt();
    		if(choice == 1){
    			CRUD.insert();
    			System.out.println("To Exit press 1 \nFor more Operations Press 2");
    			if(in.nextInt() == 1) {
    				break;
    			}
    		}
    		else if(choice == 2){
    			CRUD.update();
    			System.out.println("To Exit press 1 \nFor more Operations Press 2");
    			if(in.nextInt() == 1) {
    				break;
    			}
    		}
    		else if(choice == 3){
    			CRUD.delete();
    			System.out.println("To Exit press 1 \nFor more Operations Press 2");
    			if(in.nextInt() == 1) {
    				break;
    			}
    		}
    		else if(choice == 4){
    			CRUD.find();
    			System.out.println("To Exit press 1 \nFor more Operations Press 2");
    			if(in.nextInt() == 1) {
    				break;
    			}
    		}
    		else if(choice == 5) {
    			break;
    		}
    		else {
    			System.out.println("Invalid Choice Try Again");
    		}
    	}
    }
}
