//read a sentence and print last letter every word
package Test;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		generate(input);
	}

	public static void generate(String str) {
		str = str + " ";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				System.out.print(str.charAt(i - 1));
			}
		}
	}
}
