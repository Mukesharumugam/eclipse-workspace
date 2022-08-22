//create two int array and print the numbers that are missing in 1st array which is not present in 2nd array

import java.util.Scanner;

public class Program66 {

	public static void main(String[] args) {
		int[] ary1 = getinputary();
		int[] ary2 = getinputary();
		printmissing(ary1, ary2);
	}

	public static int[] getinputary() {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] ary1 = new int[size];
		for (int i = 0; i < size; i++) {
			ary1[i] = scan.nextInt();
		}
		return ary1;
	}

	public static void printmissing(int[] ary1, int[] ary2) {
		for (int i = 0; i < ary1.length; i++) {
			boolean status = false;
			for (int j = 0; j < ary2.length; j++) {
				if (ary1[i] == ary2[j]) {
					status = true;
					break;
				}
			}
			if (!status) {
				System.out.println(ary1[i]);
			}
		}
	}
}
