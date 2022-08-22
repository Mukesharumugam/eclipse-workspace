//count numbers of characters present in the given string without using length()

import java.util.Scanner;

public class Program45 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		int count = generate(input);
		System.out.println(count);
	}

	public static int generate(String str) {
		int count = 0;
		char[] strarry = str.toCharArray();
		for (char c : strarry) {
			count++;
		}
		return count;
	}
}
