//create int array and copy all the elements to another array

import java.util.Scanner;

public class Program62 {

	public static void main(String[] args) {
		copy();
	}

	public static void copy() {
		int ary1[] = new int[5];
		int ary2[] = new int[5];
		for (int i = 0; i < 5; i++) {
			Scanner scan = new Scanner(System.in);
			ary1[i] = scan.nextInt();
		}
		for (int i = 0; i < ary2.length; i++) {
			ary2[i] = ary1[i];
			System.out.println(ary2[i]);
		}
	}
}
