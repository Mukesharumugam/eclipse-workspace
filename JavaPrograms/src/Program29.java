//convert given string to uppercase

import java.util.Scanner;

public class Program29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		generate(input);
	}

	public static void generate(String str) {
		System.out.println(str.toUpperCase());
	}
}
