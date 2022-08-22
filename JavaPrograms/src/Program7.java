//check if a given number is even 

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		evennumber(input);
	}

	public static void evennumber(int num) {
		if (num % 2 == 0) {
			System.out.println("even nmuber");
		} else {
			System.out.println("not an even number");
		}

	}
}
