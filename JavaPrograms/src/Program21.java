//count individual vowel in the given string
import java.util.Scanner;

public class Program21 {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		generate(input);
	}
	
	public static void generate(String str) {
		int count0 = 0, count1 = 0, count2 = 0, count3 = 0, count4 = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a') {
				count0++;
			}
			if (ch == 'e') {
				count1++;
			}
			if ( ch == 'i') {
				count2++;
			}
			if ( ch == 'o') {
				count3++;
			}
			if ( ch == 'u') {
				count4++;
			}
		}
		System.out.print("a= " +count0+ " "+ "e= " +count1+ " " +"i= " +count2 +" " + "o= " +count3+ " " +"u= " +count4);
	}
}
