//check for special company 10Th above 50%,either inter above 60% or degree above 90%

import java.util.Scanner;

public class Program9A {
	
	public static void main ( String[] args) {
		Scanner scan = new Scanner ( System.in);
		float per1 = scan.nextFloat();
		float per2 = scan.nextFloat();
		float per3 = scan.nextFloat();
		company(per1,per2,per3);
	}
	public static void company(float i,float j,float k) {
		float a = 50.0f,b = 60.0f,c = 90.0f;
		if ( i > a && j > b || k > c) {
			System.out.println("company");
		}
		else {
			System.out.println("marks not satisfied");
		}
	}
}
