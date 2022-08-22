package com.learning;

interface Shape {
	void draw();
}
public class Lamdaex {
	
	public static void main(String[] args) {
		Shape circle = () -> System.out.println("draw circle");
		circle.draw();
		Shape square = () -> System.out.println("draw square");
		square.draw();
		Shape triangle = () -> System.out.println("draw triangle");
		triangle.draw();
	}
}
