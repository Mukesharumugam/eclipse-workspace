//to find the sum of all the digits present in a given string

import java.util.Scanner;

public class Program35 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		sum(input);
	}
	
//	public static void sum(String str) {
//		int sum = 0;
//		for (int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			if (ch >='0' && ch <= '9'){
//				sum += digit(ch);
//			}
//		System.out.print(sum);
//	}
//		
//	public static int digit(char ch) {
//		
//	}

	public static void sum(String str) {
		int sum = 0;
		String str2 = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >='0' && str.charAt(i) <= '9'){
				str2 += str.charAt(i);
			}
			if (str2.length() > 0) {
				sum += Integer.parseInt(str2);
				str2 ="";
			}
			// sum += Integer.parseInt(ch + "");
			}
		System.out.println(sum);
		}
	}


	










