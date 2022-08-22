//read a sentence and check whether given word is present or not

import java.util.Scanner;

public class Program32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String input2 = scan.nextLine();
	     produce(input, input2);
	}

	public static void produce(String str, String str2) {
		System.out.println(str.contains(str2));
			}
		}
