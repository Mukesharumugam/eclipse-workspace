//create int array and print the numbers that are missing in aray from 1 to 100

import java.util.Scanner;

public class Program64 {

	public static void main(String[] args) {
		missing1to100();
	}

	public static void missing1to100() {
		int ary[] = new int[2];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < ary.length; i++) {
			ary[i] = scan.nextInt();
		}
		for (int i = 0; i < ary.length; i++) {
			for (int j = 1; j <= 100; j++) {
				if ( i < ary.length && j == ary[i]) {
					i++;
				} else {
					System.out.println(j + " ");
				}
			}
		}
	}
}
