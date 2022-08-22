//create int array and print the numbers that are missing in array from 1 to 100

package Test;

import java.util.Scanner;

public class Program64 {

	public static void main(String[] args) {
		missing();
	}

	public static void missing() {
		int sumofall;
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int ary[] = new int[size];
		 for (int i = 0; i <= size - 2; i++) {
			ary[i] = scan.nextInt();
		}
		sumofall = (size*(size + 1)) / 2;
		int sumofarray = 0;
		for (int i = 0; i < size - 2; i++) {
			//sum = (size*(size + 1)) / 2;
			sumofarray = sumofarray - ary[i];
		}
		System.out.println(sumofarray);
		//int missingnum = sumofall - sumofarray;
		//System.out.println(missingnum);
	}
}
