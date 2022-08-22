//find the length of the string

import java.util.Scanner;

public class Program11 {
	
	public static void main ( String[] args) {
		Scanner scan = new Scanner ( System.in);
		String input = scan.nextLine();
		measuring(input);
	}
	public static void measuring(String str) {
		System.out.println(str.length());
	}
}
