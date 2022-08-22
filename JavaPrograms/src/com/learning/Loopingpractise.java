package com.learning;

import java.util.Scanner;

public class Loopingpractise {

	final static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * while (true) { System.out.println("hi");
		 */
		// int i = 9;
		int input = scan.nextInt();
		/*
		 * while (i <= input) { System.out.println("hi"); i++;
		 */
		// do {
		// System.out.println("hi");
		// i++;
		// }while (i <= input);
		for (int i = 1; i <= input; i++) {
			System.out.println("hi");
		}
	}
}
