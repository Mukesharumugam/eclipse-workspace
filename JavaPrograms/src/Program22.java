
//read two strings and compare is it same or not
import java.util.Scanner;

public class Program22 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input1 = scan.nextLine();
		String input2 = scan.nextLine();
		String output = comparing(input1, input2);
		System.out.println(output);
	}

	public static String comparing(String str1, String str2) {
		String output;
		for (int i = 0; i < str1.charAt(i); i++) {
			for (int j = 0; j < str2.charAt(j);j++) {
				if (str1.charAt(i) == str2.charAt(j)) {
					 return output = "same";
				}
				else {
					 return output = "not same";
				}
			}
		}
		return " ";
	}
}
