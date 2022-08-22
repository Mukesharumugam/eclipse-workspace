package com.learning;

import java.util.Scanner;

public class TerrineryOperator {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int i = scan.nextInt();
		int j = 78;
		j = (i > j) ? ++j : --j;
		System.out.println(j);
	}
}
