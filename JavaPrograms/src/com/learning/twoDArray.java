package com.learning;

public class twoDArray {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6, 11, 12 }, { 7, 8, 9 } };
		// System.out.print(arr[1][2]);
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr[i].length; j++) {
		// System.out.print( " " +arr[i][j]);
		// System.out.println();
		for (int k[] : arr) {
			for (int arr2 : k) {
				System.out.print(" " + arr2);
			}
			System.out.println();
		}
	}
}
