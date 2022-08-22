//print character by character along with index number 
import java.util.Scanner;

public class Program17 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		String input = scan.nextLine();
		generate(input);
	}
	
	public static void generate(String str) {
		for (int i = 0; i < str.length(); i++) {
			char output = str.charAt(i);
			System.out.print(output);
			System.out.println(str.indexOf(output));
		}
	}

}
