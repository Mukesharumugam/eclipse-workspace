//count vowels using switch statement
package Test;

import java.util.Scanner;

public class Program25 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();
		generate(input);
	}
	public static void generate(String str) {
		int count0 = 0,count1 = 0,count2 = 0,count3 = 0,count4 = 0; 
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
		switch (ch) {
		case 'a' :
			count0++;
			break;
		case  'e':
			count1++;
			break;
		case  'i' :
			count2++;
			break;
		case  'o' :
			count3++;
			break;
		case  'u':
			count4++;
			break;
		}
		}
		System.out.println(count0 +" "+count1+"-"+count2+"-"+count3+"-"+count4);
	}
}

