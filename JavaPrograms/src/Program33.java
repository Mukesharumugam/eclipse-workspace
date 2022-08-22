//check whether given character is alphabet or digit or symbol
import java.util.Scanner;

public class Program33 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char input = scan.next().charAt(0);
		check(input);
	}
	
	public static void check(char ch) {
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			System.out.println("alphabet");
		}
		else if (ch >= '0' && ch <= '9') {
			System.out.println("digit");
		}
		else {
			System.out.println("symbol");
		}
	}

}
