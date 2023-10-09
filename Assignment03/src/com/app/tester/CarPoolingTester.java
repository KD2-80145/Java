package com.app.tester;
import Solutions.CarPooling;
public class CarPoolingTester {

	public static void main(String[] args) {
		CarPooling car1=new CarPooling(100, 90, 20, 100, 300);
		
		System.out.println(car1.calculateDrivingCost());

	}

}
