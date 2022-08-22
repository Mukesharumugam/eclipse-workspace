//read a string and replace existing character with a new character

import java.util.Scanner;

public class Program41 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String output = replace(input);
		System.out.println(output);
	}

	public static String replace(String str) {
		String output = str.replace("s", "a");
		return output;
	}

}
