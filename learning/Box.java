package com.learning;

public class Box {
	static String box = "wooden box";

	public static int volume(int length, int breath, int height) {
		return length * breath * height;
	}

	public static void main(String[] args) {
		int vol = volume(10, 45, 23);
		System.out.println(box);
		System.out.println(vol);
	}
}
