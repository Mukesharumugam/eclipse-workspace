package com.learning;

import java.util.Scanner;

public class Nestedforloop {

	final static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int input = scan.nextInt();
		for (int i = 1; i <= input; i++) {
			for (int j = 1; j <= i;j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
}
