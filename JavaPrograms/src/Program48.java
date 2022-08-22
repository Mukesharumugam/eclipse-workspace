//read sentence and remove extra spaces present at the beginning of string and end of string

import java.util.Scanner;

public class Program48 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		remove(input);
	}

	public static void remove(String str) {
		int i = 0;
		int n = str.length();
		while (i < n && str.charAt(i) == ' ') {
			i++;
		}
		while (i < n && str.charAt(n - 1) == ' ') {
			n--;
		}
		System.out.println(str.substring(i, n));
	}
}
