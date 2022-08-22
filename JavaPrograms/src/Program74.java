//find the first biggest element in the array

import java.util.Scanner;
import java.util.Arrays;

public class Program74 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		remove(size);
		scan.close();
	}

	public static void remove(int size) {
		int ary1[] = new int[size];
		Arrays.sort(ary1);
		int big = ary1[0];
		for (int i = 0; i < ary1.length; i++) {
			Scanner scan = new Scanner(System.in);
			ary1[i] = scan.nextInt();
		}
		for (int i = 0; i < ary1.length; i++) {
			if (ary1[i] > big) {
				big = ary1[i];
			}
		}
		System.out.println(big);
	}
}
