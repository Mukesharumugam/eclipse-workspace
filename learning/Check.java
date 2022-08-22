package com.learning;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean status = check(num);
		System.out.println(status);
	}

	public static boolean check(int num) {
		if (num >= 10 && num <= 99)
			return true;
		else
			return false;
	}
}
