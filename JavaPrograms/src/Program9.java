//check if eligible for driving license

import java.util.Scanner;

public class Program9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		percentage(input);
	}

	public static void percentage(int age) {
		int b = 18;
		if ( age > b ) {
			System.out.println("eligible for license ");
		}
		else {
			System.out.println("not eligible");
		}	
		}
}

