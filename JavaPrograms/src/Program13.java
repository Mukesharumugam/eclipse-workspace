//read a sentence 

import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		generate(input);
	}
	
	public static void generate(String str) {
		System.out.println("entered sentence: " +str);
	}
}
