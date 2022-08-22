//count number of words present in the given string

import java.util.Scanner;

public class Program51 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		count(input);
	}

	public static void count(String str) {
		System.out.println(str.length());
	}
}
