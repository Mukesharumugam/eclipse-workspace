//create int array and find the sum of all elements

import java.util.Scanner;

public class Program60 {
	
	public static void main (String[] args) {
		sum();
	}
	
	public static void sum() {
		int sum = 0;
		int ary [] = new int [5];
		for (int i = 0; i < 5; i++) {
			Scanner scan = new Scanner(System.in);
			 ary[i] = scan.nextInt();
		}
		for (int i = 0; i < ary.length; i++) {
			sum = sum + ary[i];
		}
		for (int i = 0; i < ary.length; i++) {
		}
		System.out.println(sum);
	}
}

