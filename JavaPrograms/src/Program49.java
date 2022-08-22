//read a string and convert it to a character array

import java.util.Scanner;

public class Program49 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		convert(input);
	}

	public static void convert(String str) {
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			System.out.println(ch[i]);
		}
	}
}
