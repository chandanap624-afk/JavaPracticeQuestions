package com.wipro.Java.DesignPatterns;

public class Main2 {

	public static void main(String[] args) {

		Car obj1 = CarFactory.createCar("bmw");
		Car obj2 = CarFactory.createCar("audi");
		obj1.drive();
		obj2.drive();

	}
}
