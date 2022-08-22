//read a string and extract the string from the given index number till end of string

import java.util.Scanner;

public class Program40 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String output = extracting(input);
		System.out.println(output);
	}

	public static String extracting(String str) {
		String output = str.substring(1);
		return output;
	}
}
