//to get a 1st and last character of a string

import java.util.Scanner;

public class Program36 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		result(input);
	}
	
	public static void result(String str) {
		int n = str.length();
		System.out.println(str.charAt(0) +" "+ " " +str.charAt(n-1));
	}
	
}
