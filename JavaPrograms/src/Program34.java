//read a string and count number of digits present in the given string

import java.util.Scanner;

public class Program34 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		String input = scan.nextLine();
		evaluting(input);
		scan.close();
	}
	
	public static void evaluting(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				count++;
			}
		}
		System.out.println(count);
	}

}
