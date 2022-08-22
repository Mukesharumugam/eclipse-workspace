//print index number of each occurrence of a given string

import java.util.Scanner;

public class Program47 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		occurance(input);
	}
	public static void occurance(String str) {
		for (int i =0; i < str.length();i++) {
			System.out.print(i);
		}
	}

}
