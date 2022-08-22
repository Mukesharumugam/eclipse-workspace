package com.learning;

interface Add {
	int calc(int a, int b);
}

public class Lambdaadd {

	public static void main(String[] args) {
		Add obj = (a, b) -> a + b;
		int result = obj.calc(5, 5);
		System.out.println(result);
	}
}
