// to count vowels individually using one count variable

package Test;

import java.util.Scanner;

public class Program26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		generate(input);
	}

public static void generate(String str) { 
	int count = 0;
	String str2 = "aeiou";
	for (int i = 0; i < str.length(); i++) {
		char ch = str.charAt(i);
		for ( int j = 0; j < str2.length(); j++) {
			//char ch2 = str2.charAt(j);
			if (str.charAt(i) == str2.charAt(j)) {
				count++;
			}
		}
	}
	System.out.println(count);
}
}