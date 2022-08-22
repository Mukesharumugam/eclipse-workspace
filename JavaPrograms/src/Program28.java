//read a string and print occurance of each charcter

import java.util.Scanner;

public class Program28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		generate(input);
	}

	public static void generate(String str) {
		String output = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int count;
		for (int i = 0; i < output.length(); i++) {
			count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (output.charAt(i) == str.charAt(j)) {
					count++;
				}
			}
			System.out.println(output.charAt(i) +" =" + " " + count +" ");
		}
	}

}
