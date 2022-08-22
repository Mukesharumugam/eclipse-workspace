package com.learning;

public class Laptop {
	String brand;
	String model;
	int year;

	public void show(String brand, String model) {
		this.brand = brand;
		this.model = model;
		System.out.println("brand:"  + brand + "|" + "model:"  + model);
		System.out.println("super class methods");
	}
	public void show(String brand, String model,int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
		System.out.println("brand:"  + brand + "|" + "model:" + model +"|" + "year:" +year);
	}
}
