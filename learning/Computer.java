package com.learning;

public class Computer extends Laptop {
	public void show(String brand, String model) {
		super.show(brand, model);
		System.out.println("Hello Java");
	}
}
