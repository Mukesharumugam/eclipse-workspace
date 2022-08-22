
//read a string and print character by character
import java.util.Scanner;

public class Program16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		generate(input);
	}

	public static void generate(String str) {
		for (int i = 0; i < str.length(); i++) {
			char output = str.charAt(i);
			System.out.println("the character is: " + output);
		}
	}
}
