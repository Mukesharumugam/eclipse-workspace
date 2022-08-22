//count given character present in the string 

import java.util.Scanner;

public class Program19 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		String input = scan.nextLine();
		int output = produce(input);
		System.out.println(output);
	}
	
	public static int produce(String str) {
		return str.length();
	}
}
