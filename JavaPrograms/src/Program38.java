//reverse the string

import java.util.Scanner;

public class Program38 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		reverse(input);
	}
	
	public static void reverse(String str) {
		for (int i =  str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
			
		}
	}

}
