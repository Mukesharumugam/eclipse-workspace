package com.learning;

import java.util.Scanner;

public class ProgramSwitchCase {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		char operation = scan.next().charAt(0);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int output;
		switch (operation) {
		case '1':
			output = num1 + num2;
			System.out.println(output);
			break;
		case '2':
			output = num1 - num2;
			System.out.println(output);
			break;
		case '3':
			output = num1 * num2;
			System.out.println(output);
			break;
		case '4':
			output = num1 / num2;
			System.out.println(output);
			break;
		case '5':
			output = num1 % num2;
			System.out.println(output);
			break;
		default:
			System.out.println("select particular case present");
		}
	}
}
