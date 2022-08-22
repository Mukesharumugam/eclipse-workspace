package com.learning;

interface A {
	public void show(int num);
}

public class Lamdademo {

	public static void main(String[] args) {
		A obj = (num) -> System.out.println("Hello lamda" + " " + num);
		obj.show(6);
		// System.out.println(obj);
		//System.out.println(obj.toString());
		//System.out.println(obj.getClass());
	}
}