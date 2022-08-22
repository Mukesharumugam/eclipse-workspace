//read a sentence split it and join it

import java.util.Scanner;

public class Program52 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		sentence(input);
	}

	public static void sentence(String str) {
		String[] str2 = str.split(" ", 6);
		for (int i = 0; i < str2.length; i++) {
			System.out.print(str2[i]);
		}
		String str3 = str.join(" ", "a", "b", " c", "d", "e", "f");
		System.out.println();
		System.out.print(str3);
	}
}
