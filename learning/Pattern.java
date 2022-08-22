package com.learning;

public class Pattern {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		outer: for (int i = 0; i < 5; i++) {
			inner: for (int j = 0; j < i; j++) {
				if (i == 2) {
					break outer;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("*");
		}
		outer: for (int i = 0; i < 5; i++) {
			inner: for (int j = 0; j < i; j++) {
				if (i == 2) {
					break outer;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		
	}
}