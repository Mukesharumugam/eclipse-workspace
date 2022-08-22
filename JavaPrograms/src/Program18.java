//print character by character in reverse order

import java.util.Scanner;

public class Program18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		generate(input);
	}

	public static void generate(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			System.out.print(ch);
			System.out.println();

		}
	}
}