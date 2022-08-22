//read a sentence and reverse in the expected format

import java.util.Scanner;

public class Program55 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(converter(scan.nextLine()));
	}

	public static String converter(String input) {
		String[] str = input.split(" ");
		String output = "";
		for (int i = 0; i < str.length; i++) {
			output = output + reverse(str[i]) + " ";
		}
		return output;
	}	

	public static String reverse(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return output;
	}
}
	//how are you

