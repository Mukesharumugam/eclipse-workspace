//create two array and copy all the elements from both arrays to third array

import java.util.Scanner;

public class Program63 {

	public static void main(String[] args) {
		copy();
	}

	public static void copy() {
		int ary1[] = new int[3];
		int ary2[] = new int[3];
		int ary3[] = new int[ary1.length + ary2.length];
		int count = 0;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < ary1.length; i++) {
			ary1[i] = scan.nextInt();
			ary3[count] = ary1[i];
			count++;
		}
		for (int i = 0; i < ary2.length; i++ ) {
			ary2[i] = scan.nextInt();
			ary3[count] = ary2[i];
			count++;
		}
		for (int i = 0; i < ary3.length; i++) {
			System.out.print(ary3[i]);
		}
	}
}


