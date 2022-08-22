package in.test;

import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		Calculate obj = new Calculate(a,b);
		obj.performAdd();
		obj.performSub();
	}
	
}
