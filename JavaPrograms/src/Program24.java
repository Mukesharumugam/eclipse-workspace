import java.util.Scanner;

//check whether the string is palindrome or not

public class Program24 {
	
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		scan.close();
		boolean status = palindrome(input);
		System.out.println(status);
	}

	public static boolean palindrome(String input) {
		return compare(input, reverse(input));
	}
	
	public static String reverse(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return output;
	}
	
	public static boolean compare(String str1, String str2) {
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	
//	public static void palindrome() {
//		String str = "malayalam";
//		String rev = " ";
//		for ( int i = str.length()-1; i >)
//		
//			}
//		}
//	}
}
