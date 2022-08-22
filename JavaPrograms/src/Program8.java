//check if eligible for a company percentages

import java.util.Scanner;

public class Program8 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float input = scan.nextFloat();
		percentage(input);
	}

	public static void percentage(float a) {
		float b = 70.0f;
		if (a >= b) {
			System.out.println("eligible");
		} else {
			System.out.println("not eligible");
		}
	}
}
