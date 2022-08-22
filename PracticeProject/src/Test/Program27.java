//read a string and remove a dublicate character
package Test;

import java.util.Scanner;

public class Program27 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		generate(input);
	}

	public static void generate(String str) {
		String str2 = " ";
		int count = 0;
		for (int i = 0; i < str.charAt(i); i++) {
			for (int j = 0; j < i; j++) {
				if (str.charAt(i) == str2.charAt(j)) {
					break;
				}
				if (j == i) { 
					count++;
			}
				System.out.println(str.charAt(i));
		}
	}
}
}