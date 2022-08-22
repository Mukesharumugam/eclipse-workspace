//create 2 int array and print that are missing in 2nd array which is not present in 1st array

import java.util.Scanner;

public class Program65 {

	public static void main(String[] args) {
		int[] arr1 = getIntArr();
		int[] arr2 = getIntArr();
		missing(arr1, arr2);
	}
	
	public static int[] getIntArr() {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		return arr;
	}

	public static void missing(int[] arr1, int[] arr2) {
		for (int j = 0; j < arr2.length; j++) {
			boolean status = false;
			for (int i = 0; i < arr1.length; i++) {
				if (arr2[j] == arr1[i]) {
					status = true;
					break;
				}
			}
			if (status == false) {
				System.out.println(arr2[j]);
			}
		}
	}
	
	
//	public static void missing(int size1, int size2) {
//		int ary1[] = new int[size1];
//		int ary2[] = new int[size2];
//		//int mis = 0;
//		Scanner scan = new Scanner(System.in);
//		(int j = 0; j < ary2.length; j++) {
//			ary2[j] = scan.nextInt();
//		}for (int i = 0; i < ary1.length; i++) {
//			ary1[i] = scan.nextInt();
//		}
//		for 
//		for (int i = 0; i < ary1.length; i++) {
//			for (int j = 0; j < ary2.length; j++) {
//				if (ary1[i] != ary2[j]) {
//					System.out.println(ary1[i]);
//				}
//			}
//		}
//	}
}