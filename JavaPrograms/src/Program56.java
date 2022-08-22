//create int array and read array size and array element in runtime

import java.util.Scanner;

public class Program56 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		generatearyelement(size);
		}
	
	public static void generatearyelement(int size) {
		int [] ary = new int[size];
		for (int i = 0; i < ary.length; i++) {
			Scanner scan = new Scanner(System.in);
			ary[i] = scan.nextInt();
		}
		for (int i = 0; i < ary.length; i++) {
			System.out.print(ary[i]);
		}
	}
}
