//print index of each occurrence of a given character

import java.util.Scanner;

public class Program46 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		occurance(input);
	}

	public static void occurance(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.print(ch + " " + "=");
			System.out.print(" ");
			System.out.print(str.indexOf(ch));
			System.out.print(" ");
		}
	}
}
