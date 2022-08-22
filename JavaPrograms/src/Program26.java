
//to count vowels individually using one count variable
import java.util.Scanner;

public class Program26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		
		generate(input);
	}
	
	public static void generate(String str) {
		String vowelSet = "aeiou";
		for (int i = 0; i < vowelSet.length(); i++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == vowelSet.charAt(i)) {
					count++;
				}
			}
			System.out.println(vowelSet.charAt(i) + "-" + count);
		}
	}

	

	


}
