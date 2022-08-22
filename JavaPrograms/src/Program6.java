
//print patterns
import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		pattern(input);
	}

	public static void pattern(int num) {
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == j) {
					// $
					System.out.print("$");
				} else {
					//*
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
