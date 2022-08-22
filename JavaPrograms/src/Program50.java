//read the sentence and convert into string array

import java.util.Scanner;

public class Program50 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		convertsentence(input);
	}

	public static void convertsentence(String str) {
		String[] str2 = str.split(" ");
		for (int i = 0; i < str2.length; i++) {
			System.out.print(str2[i]);
		}
	}
}
