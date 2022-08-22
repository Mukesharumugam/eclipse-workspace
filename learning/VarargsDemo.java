package com.learning;

public class VarargsDemo {
	int result;

	public void multiply(int... n) {
		for (int i = 0; i < n.length; i++) {
			result = n[i] * 2;
		}

		System.out.println(result);
	}

	public static void main(String[] args) {
		VarargsDemo obj = new VarargsDemo();
		obj.multiply(1, 2, 3,11,34,56,78);
		
	}
}
