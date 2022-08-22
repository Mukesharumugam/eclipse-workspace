//print A to Z if given number is divisible by 7 else print Z to A

import java.util.Scanner;

public class Program5 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		printatoz(num);
		
	}
	
	public static void printatoz(int input) {
		if (input % 7 == 0) {
			//loop a-z
			for (char letter = 'a';letter <='z';letter++) {
				System.out.println(letter);
			}
		}
		else {
			//loop z-a
			for ( char letter = 'z';letter >='a';letter--) {
				System.out.println(letter);
			}
	
		}
	}
}
