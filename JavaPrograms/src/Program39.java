//read two string and check which string is greater

import java.util.Scanner;

public class Program39 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input1 = scan.nextLine();
		String input2 = scan.nextLine();
		int output = checking(input1, input2);
		System.out.println(output);
	}

	public static int checking(String str1, String str2) {
		int output = str1.compareToIgnoreCase(str2);
		return output;

	}

}
