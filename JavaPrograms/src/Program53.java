//read a sentence and print the last letter of every word

import java.util.Scanner;

public class Program53 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		printlastlet(input);
	}

	public static void printlastlet(String str) {
		str = str + " ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				System.out.println(str.charAt(i - 1));
			}
		}
	}
}
