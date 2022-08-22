//reverse a string

import java.util.Scanner;

public class Program23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		String output = reversing(input);
		System.out.println(output);
	}
	
	public static String reversing(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}
}
