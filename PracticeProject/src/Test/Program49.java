//read a string and convert into a character array

package Test;

import java.util.Scanner;

public class Program49 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		generate(input);
	}

	public static void generate(String str) {
		char[] ch = new char[str.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = str.charAt(i);
			System.out.print(ch[i]);
		}  
	}
}
