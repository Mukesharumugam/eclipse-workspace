//read a string and remove duplicate character

import java.util.Scanner;

public class Program27A {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		String output = generate(input);
		System.out.println(output);
	}

	public static String generate(String str) {
		String output = "";
		int count = 0, j, i;
		for (i = 0; i < str.length(); i++) {
			for (j = 0; j < i; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					break;
				}
			}
			if (j == i) {
				count++;
				output += str.charAt(i);

			}
		}
		return output;
	}
}
