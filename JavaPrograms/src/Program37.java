//to read a string and extract part of string based on start index and end index

import java.util.Scanner;

public class Program37 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		result(input);
	}

	public static void result(String str) {
		System.out.println(str.substring(3, 6));
	}
}
