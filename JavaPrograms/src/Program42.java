// read a string and remove a given character from the string

import java.util.Scanner;

public class Program42 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input1 = scan.nextLine();
		String input2 = scan.nextLine();
		String output = removing(input1, input2);
		System.out.println(output);
	}

	public static String removing(String str1, String str2) {
		String output = "";
		for (int i = 0; i < str1.length(); i++) {
			for (int j = 0; j < str2.length(); j++) {
				char ch1 = str1.charAt(i);
				char ch2 = str2.charAt(j);
				if (ch1 != ch2) {
					output += str1.charAt(i);
				}
			}
		}
		return output;
	}
}