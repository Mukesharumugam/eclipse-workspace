//read two strings and compare is it same or not

package Test;

import java.util.Scanner;

public class Program22 {
	
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		String input1 = scan.nextLine();
		String input2 = scan.nextLine();		
		produce(input1,input2);
	}
	
	public static void produce (String str1,String str2) {
		boolean a = true;
		boolean b = false;
		if (str1.equals(str2)) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}
}
